/*Побудувати три класи (базовий і 2 нащадка), що описують деяких працівників з погодинною оплатою (один з нащадків)
і фіксованою оплатою (другий нащадок).
Описати в базовому класі абстрактний метод для розрахунку середньомісячної заробітної плати.
Для «почасових» формула для розрахунку така: «середньомісячна заробітна плата = 20.8 * 8 * погодинну ставку»,
для працівників з фіксованою оплатою «середньомісячна заробітна плата = фіксованою місячної оплати».
a) Упорядкувати всю послідовність працівників по спадаючій середньомісячного заробітку.
   При збігу зарплати - упорядковувати дані за алфавітом по імені.
   Вивести ідентифікатор працівника, ім'я та середньомісячний заробіток для всіх елементів списку.
b) Вивести перші 5 імен працівників з отриманого в пункті а) списку.
c) Вивести останні 3 ідентифікатора працівників з отриманого в пункті а) списку.
d) Організувати запис і читання колекції у/з файл.
e) Організувати обробку некоректного формату вхідного файлу.*/

import java.io.*;
import java.util.*;

class Lab5 {

public abstract static class Worker implements Comparable<Worker>{
    private double MonthSalary;
    private String name;
    private String surname;
    private long id;

    public Worker(String name, String surname, double salary, long id){
        this.name = name;
        this.surname = surname;
        this.id = id;
        MonthSalary = countMonthSalary(salary);
    }

    abstract double countMonthSalary(double salary);

    public String getName(){ return name; }
    public String getSurname(){ return surname; }
    public long getId(){ return id; }
    public double getMonthSalary(){ return MonthSalary; }

    @Override
    public int compareTo(Worker other){
        if (this.MonthSalary!=other.MonthSalary) return (int)(this.MonthSalary-other.MonthSalary);
        else return this.name.compareTo(other.name);
    }
}

public static class HourSalaryWorker extends Worker {

    private double hourSalary;

    public HourSalaryWorker(String name, String surname, double salary, long id) {
        super(name, surname, salary, id);
        hourSalary = salary;
    }

    public double getHourSalary() { return hourSalary; }

    @Override
    double countMonthSalary(double salary) { return 20.8 * 8 * salary; }
}

public static class FixedSalaryWorker extends Worker {

    private double fixedSalary;

    public FixedSalaryWorker(String name, String surname, double salary, long id) {
        super(name, surname, salary, id);
        fixedSalary = salary;
    }

    @Override
    double countMonthSalary(double salary) {
        return salary;
    }
}

    public static void main(String[] args) throws IOException{
        ArrayList<HourSalaryWorker> hourSalaryWorkers = getHourSalaryWorkerList("HourSalaryWorker.txt");
        ArrayList<FixedSalaryWorker> fixedSalaryWorkers = getFixedSalaryWorkerList("FixedSalaryWorker.txt");

        Collections.sort(hourSalaryWorkers);
        Collections.sort(fixedSalaryWorkers);

        int k;
        System.out.println("First 5 names:");
        if (fixedSalaryWorkers.size() < 5) k=fixedSalaryWorkers.size();
        else k=5;
        System.out.println("Fixed Salary Workers: ");
        for (int i=0; i<k; i++)
        {
            System.out.print(fixedSalaryWorkers.get(i).getName() + " " + fixedSalaryWorkers.get(i).getSurname());
            System.out.print("(" + fixedSalaryWorkers.get(i).getMonthSalary() + ")\n");
        }
        if (hourSalaryWorkers.size() < 5) k=hourSalaryWorkers.size();
        else k=5;
        System.out.println("\n" + "Hour Salary Workers:");
        for (int i=0; i<k; i++)
        {
            System.out.print(hourSalaryWorkers.get(i).getName() + " " + hourSalaryWorkers.get(i).getSurname());
            System.out.print("(" + hourSalaryWorkers.get(i).getMonthSalary() + ")\n");
        }

        System.out.println("\n" + "Last 3 ids:");
        if (fixedSalaryWorkers.size() >= 3) k = fixedSalaryWorkers.size()-3;
        else k = 0;
        System.out.println("Fixed Salary Workers:");
        for (int i=k; i<fixedSalaryWorkers.size(); i++)
        {
            System.out.print(Long.toString(fixedSalaryWorkers.get(i).getId()));
            System.out.print("(" + fixedSalaryWorkers.get(i).getName() + " " + fixedSalaryWorkers.get(i).getSurname() + ")\n");
        }
        System.out.println("\n" +   "Hour Salary Workers:");
        if (hourSalaryWorkers.size() >= 3) k = hourSalaryWorkers.size()-3;
        else k = 0;
        for (int i=k; i<hourSalaryWorkers.size(); i++)
        {
            System.out.print(Long.toString(hourSalaryWorkers.get(i).getId()));
            System.out.print("(" + hourSalaryWorkers.get(i).getName() + " " + hourSalaryWorkers.get(i).getSurname() + ")\n");
        }

        hourSalaryWorkers.add(new HourSalaryWorker("Bob","Smith",80,315));
        fixedSalaryWorkers.add(new FixedSalaryWorker("Tom","Smith",3000,348));

        setHourSalaryWorkerList("NewHourSalaryWorker.txt", hourSalaryWorkers);
        setFixedSalaryWorkerList("NewFixedSalaryWorker.txt", fixedSalaryWorkers);
    }

    public static ArrayList getHourSalaryWorkerList(String filename)throws IOException
    {
        ArrayList<HourSalaryWorker> workersList = new ArrayList<HourSalaryWorker>();
        File file = new File(filename);
        if(!file.exists()) {
            System.out.println("!!! File " + filename + " doesn`t exist. The list is empty !!!");
            return workersList;
        }
        Scanner scanner = new Scanner(file);
        int linenum = 0;
        while (scanner.hasNextLine())
        {
                try {
                    String[] NewWorker = scanner.nextLine().split(" ");
                    linenum++;
                    if (NewWorker.length > 4) throw new Exception();
                    String name = NewWorker[0];
                    String surname = NewWorker[1];
                    long id = Long.parseLong(NewWorker[2]);
                    double salary = Double.parseDouble(NewWorker[3]);
                    HourSalaryWorker w = new HourSalaryWorker(name,surname,salary,id);
                    workersList.add(w);
                }
                catch (Exception e) {
                    System.out.println("!!! There is a mistake in " + linenum + " in " + filename + ". This worker wasn`t added to the list !!!");
                }
            }
        return workersList;
    }
    public static ArrayList getFixedSalaryWorkerList(String filename)throws IOException
    {
        ArrayList<FixedSalaryWorker> workersList = new ArrayList<FixedSalaryWorker>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        if(!file.exists()) {
            System.out.println("!!! File " + filename + " doesn`t exist. The list is empty !!!");
            return workersList;
            }

        int linenum = 0;
        while (scanner.hasNextLine())
        {
                try {
                    String[] NewWorker = scanner.nextLine().split(" ");
                    linenum++;
                    if (NewWorker.length > 4) throw new Exception();
                    String name = NewWorker[0];
                    String surname = NewWorker[1];
                    long id = Long.parseLong(NewWorker[2]);
                    double salary = Double.parseDouble(NewWorker[3]);
                    FixedSalaryWorker w = new FixedSalaryWorker(name,surname,salary,id);
                    workersList.add(w);
                }
                catch (Exception e) {
                    System.out.println("!!! There is a mistake in " + linenum + " in " + filename + ". This worker wasn`t added to the list !!!");
                }
        }
        return workersList;
    }

    public static void setHourSalaryWorkerList(String filename, ArrayList<HourSalaryWorker> arr)throws IOException
    {
        FileWriter writer = new FileWriter(filename, false);
        for (int i=0; i<arr.size(); i++)
            writer.write(arr.get(i).getName() + " " + arr.get(i).getSurname() + " " + arr.get(i).getId() + " " + arr.get(i).getHourSalary() + "\n");
        writer.close();
    }

    public static void setFixedSalaryWorkerList(String filename, ArrayList<FixedSalaryWorker> arr)throws IOException
    {
        FileWriter writer = new FileWriter(filename, false);
        for (int i=0; i<arr.size(); i++)
            writer.write(arr.get(i).getName() + " " + arr.get(i).getSurname() + " " + arr.get(i).getId() + " " + arr.get(i).getMonthSalary() + "\n");
        writer.close();
    }

}


