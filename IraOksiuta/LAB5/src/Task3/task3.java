package Task3;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Collections;
import java.io.File;
import java.lang.*;
import java.util.Scanner;
public class task3{
    private static ArrayList<Employee> createEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Fixed_Salary(1, "Anna", 1000));
        employees.add(new Fixed_Salary(2, "John", 1500));
        employees.add(new Hourly_Wage(3, "Rita", 23));
        employees.add(new Hourly_Wage(4, "Bob", 12));
        employees.add(new Fixed_Salary(5, "Charlotte", 970));
        employees.add(new Hourly_Wage(6, "Melissa", 20));
        employees.add(new Fixed_Salary(7, "Charles", 2000));
        employees.add(new Hourly_Wage(8, "Emma", 15));
        employees.add(new Hourly_Wage(9, "Michael", 25));
        employees.add(new Fixed_Salary(10, "Robert", 1300));

        return employees;
    }

    private static void writeEmployeesToFile(ArrayList<Employee> employees) {
        try {
            PrintWriter writer = new PrintWriter("Employees.txt", "UTF-8");
            for (int i=0;i<employees.size();i++)
                writer.println(employees.get(i).writeToFile());

            writer.close();
        }
        catch (Exception e) {}
    }

    private static  ArrayList<Employee> readEmployeesFromFile(String file) {
        ArrayList<Employee> employees = new ArrayList<>();
        File f = new File(file);
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext())
                employees.add(Employee.createEmployee(scanner));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Read successfully");
        return employees;
    }

    public static void main() {
        System.out.println("task3 a): ");
        ArrayList<Employee> employees=createEmployees();
        Collections.sort(employees,new CustomComparator());
        for (int i=0;i<employees.size();i++) System.out.println(employees.get(i).print());
        System.out.println("task3 b): ");
        for (int i=0;i<5;i++) System.out.println(employees.get(i).print());
        System.out.println("task3 c): ");
        for(int i = employees.size()-3; i<employees.size(); i++) System.out.println(employees.get(i).print());
        System.out.println("task3 d): ");
        writeEmployeesToFile(employees);
        readEmployeesFromFile("Employees.txt");
    }
}
