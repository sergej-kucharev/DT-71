import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

abstract class Employee{
    private String Name;
    private int id;

    public Employee( int id, String Name){
        this.Name = Name;
        this.id = id;
    }
    public String getName(){
        return Name;
    }
    public int getId(){
        return id;
    }
    public abstract double AverangeSalary();
    public abstract void print();
}

class HourSalaryEmployee extends Employee {
    private double Salary;

    public HourSalaryEmployee(int id, String Name, double Salary){
        super(id, Name);
        this.Salary = Salary;
    }
    public double getHourSalary(){
        return Salary;
    }
    public double AverangeSalary(){
        return 20.8*8*Salary;
    }
    public void print(){
        System.out.println("HourSalaryEmployee:id: " + this.getId() + " Name: " + this.getName() + " HourSalary: " + this.getHourSalary());
    }
}

class FixSalaryEmployee extends Employee {
    private double Salary;

    public FixSalaryEmployee(int id, String Name, double Salary){
        super(id, Name);
        this.Salary = Salary;
    }
    public double getFixSalary(){
        return Salary;
    }
    public double AverangeSalary(){
        return Salary;
    }
    public void print(){
        System.out.println("FixSalaryEmployee: id: " + this.getId() + " Name: " + this.getName() + " FixSalary: " + this.getFixSalary());
    }
}

class SortEmployee implements Comparator<Employee>{
    public int compare(Employee Obj1, Employee Obj2){
        if(Obj1.AverangeSalary() != Obj2.AverangeSalary())
            return (int)(Obj1.AverangeSalary() - Obj2.AverangeSalary());
        else
            return Obj1.getName().compareTo(Obj2.getName());
    }
}

public class task3 {

    public static boolean I_HAVE_TO_CHECK_DATA(String str ){
        char[] a = str.toCharArray();
        for( int i = 0; i < str.length(); i++)
            if( (a[i] > '9' )||( a[i] < '0'))
                return false;
        return true;
    }
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        int IdNumber = 0;
        boolean ch = false;
        try{
            File file = new File("task3in1.txt");

            Scanner Reader = new Scanner (file);
            while(Reader.hasNextLine()) {
                String data = Reader.nextLine();
                String[] Str = data.split(" ");
                ch = I_HAVE_TO_CHECK_DATA(Str[1]);
                if( !ch )
                    System.out.println("YOU ENTERED ANCORRECT DATA, be careful and goodluck  ");
                HourSalaryEmployee ObjHourEmployee = new HourSalaryEmployee(IdNumber,Str[0],Integer.parseInt(Str[1]));
                list.add(ObjHourEmployee);
                IdNumber++;
            }
            Reader.close();
        }catch (IOException except){
            System.out.println("Problem with file: task3in1.txt");
        }
        try{
            File file = new File("task3in2.txt");

            Scanner Reader = new Scanner (file);
            while(Reader.hasNextLine()) {
                String data = Reader.nextLine();
                String[] Str = data.split(" ");
                ch = I_HAVE_TO_CHECK_DATA(Str[1]);
                if( !ch )
                    System.out.println("YOU ENTERED ANCORRECT DATA, be careful and goodluck  ");
                FixSalaryEmployee ObjFixEmployee = new FixSalaryEmployee(IdNumber,Str[0],Integer.parseInt(Str[1]));
                list.add(ObjFixEmployee);
                IdNumber++;
            }
            Reader.close();
        }catch (IOException except){
            System.out.println("Problem with file: task3in2.txt");
        }

        Comparator CompareEmployee = new SortEmployee();
        Collections.sort(list,Comparator.comparing((Employee p)->p.AverangeSalary()).reversed().thenComparing(p->p.getName()));
        System.out.println("SOOOORTTT");
        int len = 0;

        for(Employee temp:list){
            System.out.println(Integer.toString(temp.getId()) + " " + temp.getName()
                    + " " + Double.toString(temp.AverangeSalary()) );
            len++;
        }

        try {
            File OutFile = new File("task3output.txt");

            FileWriter WriteFile = new FileWriter("task3output.txt");
            for(Employee temp:list)
                WriteFile.write(Integer.toString(temp.getId()) + " " + temp.getName()
                        + " " + Double.toString(temp.AverangeSalary()) + "\n");


            WriteFile.close();
        }catch(IOException except){
            System.out.println("Problem with file: task3output.txt");
        }
        System.out.println("==================================================");
        System.out.println("FIRST 5" );
        for( int i = 0; i < 5; i++)
            System.out.println(list.get(i).getName());
        System.out.println("LAST 3" );
        for( int i = len-3; i < len; i++)
            System.out.println(list.get(i).getName());
    }

}