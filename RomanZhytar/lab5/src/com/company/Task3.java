package com.company;

import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Task3 {

    public static ArrayList<Employee> Deserialize(String filename) throws Exception {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        var list = (ArrayList) ois.readObject();
        ois.close();
        fis.close();
        return list;
    }

    public static void Serialize(ArrayList<Employee> list, String filename) throws Exception {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close();
        fos.close();
    }

    public static void main(String[] args) {
        try {
            // uses builtin serialization
            ArrayList<Employee> list = Deserialize("employeeData");

            list.sort((lhs, rhs) -> {
                int result1 = -Double.compare(lhs.GetAverageSalary(), rhs.GetAverageSalary());
                int result2 = lhs.getName().compareTo(rhs.getName());
                return result1 != 0 ? result1 : result2;
            });
            System.out.println("Top 5 names:");
            for (int i = 0; i < Math.min(list.size(), 5); ++i) {
                System.out.println(list.get(i).getName());
            }

            System.out.println("Last 3 ids:");
            for (int i = 0; i < Math.min(list.size(), 3); ++i) {
                System.out.println(list.get(list.size() - i - 1).getId());
            }

            Serialize(list, "employeeData");
        } catch (Exception e) {
            System.out.println("something went wrong");
            e.printStackTrace();
        }
    }
}

abstract class Employee implements Serializable {
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract double GetAverageSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String name;
    private String id;
}

class FixedSalaryEmployee extends Employee {

    public FixedSalaryEmployee(String name, String id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FixedSalaryEmployee{" +
                "salary=" + salary +
                "id=" + getId() +
                "name=" + getName() +
                '}';
    }

    @Override
    double GetAverageSalary() {
        return salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;
}

class HourlyWageEmployee extends Employee {

    public HourlyWageEmployee(String name, String id, double wage) {
        super(name, id);
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "HourlyWageEmployee{" +
                "id=" + getId() +
                "name=" + getName() +
                "wage=" + wage +
                '}';
    }

    @Override
    double GetAverageSalary() {
        return 20.8 * 8 * wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    private double wage;
}