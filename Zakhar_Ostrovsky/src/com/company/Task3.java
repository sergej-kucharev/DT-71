package com.company;

import java.io.*;
import java.util.*;


abstract class Labor_force implements Comparable <Labor_force> {
    static int N = 0;
    double month_payment;
    String name;
    int id;

    Labor_force() {this.id = ++N;}

    public abstract void calc_payment();

    @Override
    public int compareTo(Labor_force labor_force) {

        int result = - Double.compare(this.month_payment, labor_force.month_payment);

        if (result == 0)
            result = this.name.compareTo(labor_force.name);

        return result;
    }

    @Override
    public String toString() {
        return    this.name + ',' +
                + this.month_payment + ',' +
                + this.id;
    }
}

class Worker_by_hour extends Labor_force {
    double wage;

    Worker_by_hour(double wage, String name) {
        this.wage = wage;
        this.name = name;
        calc_payment();
    }

    public void calc_payment() {
        this.month_payment = 20.8 * 8 * this.wage;
    }
}

class Worker_by_month extends Labor_force {
    double salary;

    Worker_by_month(double salary, String name) {
        this.salary = salary;
        this.name = name;
        calc_payment();
    }

    public void calc_payment() {
        this.month_payment = salary;
    }
}


public class Task3 {

    static void push_workers_to_file(List<Labor_force> list) throws IOException
    {
        FileWriter fw = new FileWriter("workers.csv");

        for (Labor_force w : list) {
            fw.write(w.toString() + ',' + w.getClass().getSimpleName() + '\n');
        }

        fw.flush();
        fw.close();
    }

    static List<Labor_force> pull_workers_from_file() throws IOException
    {
        File csvFile = new File("workers.csv");

        if (csvFile.isFile())
        {
            BufferedReader csvReader = new BufferedReader(new FileReader("workers.csv"));
            String row;
            List<Labor_force> list = new ArrayList<>();

            while ((row = csvReader.readLine()) != null)
            {
                String[] data = row.split(",");

                if (data[3].equals("Worker_by_hour")) {
                    list.add(new Worker_by_hour(Double.valueOf(data[1]) / 20.8 / 8, data[0]));
                }
                else if (data[3].equals("Worker_by_month")) {
                    list.add(new Worker_by_month(Double.valueOf(data[1]), data[0]));
                }
            }

            csvReader.close();

            return list;
        }
        else
        {
            System.out.println("No csv file exists.");

            return null;
        }

    }

    public static void main(String[] args) throws IOException
    {

        Worker_by_hour w1 = new Worker_by_hour(10, "Vasya"),
                w2 = new Worker_by_hour(20, "Petya"),
                w3 = new Worker_by_hour(15, "Alex"),
                w4 = new Worker_by_hour(15, "Bob");
        Worker_by_month w5 = new Worker_by_month(1896, "Zakhar"),
                w6 = new Worker_by_month(2600, "Zakhar2017");

        List<Labor_force> list = new ArrayList<>();

        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);
        list.add(w6);

        System.out.println("\n-------до сортування--------");
        for (Labor_force w : list) {
            System.out.println(w);
        }

        System.out.println("\n-------5 після сортування-----");
        Collections.sort(list);
        for (int i = 0; i < 5; i++)
            System.out.println(list.get(i));

        // show last 3 id
        List<Integer> id_list = new ArrayList<Integer>();
        for (Labor_force w : list)
            id_list.add(w.id);

        Collections.sort(id_list);
        System.out.println("\n-------останні 3 айдішки-----");
        for (int i = id_list.size()-1; i > id_list.size()-4; i--)
            System.out.println(id_list.get(i));

        push_workers_to_file(list);

        System.out.println("\n-------після зчитування з файла-----");
        List<Labor_force> r_list = pull_workers_from_file();

        if (r_list != null)
        {
            for (Labor_force w : r_list)
                System.out.println(w);
        }
    }

}
