import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Math.min;
import static java.lang.System.exit;

public class Task3 {

    public static void main(String[] args) {
        ArrayList<Worker> workers = readFromFile("input.txt");
        Collections.sort(workers, new CompareWorker());
        System.out.println("Sorted workers:");
        printWorkersList(workers);
        System.out.println("First five:");
        printFirstFiveNames(workers);
        System.out.println("\nLast three:");
        printLastThreeIDs(workers);
        writeToFile(workers, "output.txt");
    }
    public static ArrayList<Worker> readFromFile(String path) {
        ArrayList<Worker> workers = new ArrayList<>();
        File file = new File(path);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            int n;
            try {
                n = scanner.nextInt();
                while (n-->0) {
                    int isHour = scanner.nextInt();
                    int ID = scanner.nextInt();
                    String name = scanner.next();
                    double salary = scanner.nextDouble();
                    Worker worker;
                    if (isHour == 1) {
                        worker = new Worker_Hour(ID, name, salary);
                    }
                    else {
                        worker = new Worker_Fixed(ID, name, salary);
                    }
                    workers.add(worker);
                }
                scanner.close();
            } catch (Exception e) {
                System.out.println("Something went wrong while reading from file");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            exit(1);
        }
        return workers;
    }
    public static void printFirstFiveNames(ArrayList<Worker> workers) {
        int n = workers.size();
        if (n < 5) {
            System.out.print("There are only " + n + " workers:\n");
        }
        for (int i = 0; i < min(n, 5); i++) {
            System.out.println(workers.get(i).getName());
        }
    }
    public static void printLastThreeIDs(ArrayList<Worker> workers) {
        int n = workers.size();
        if (n < 3) {
            System.out.println("There are only " + n + "workers:");
        }
        for (int i = max(0, n - 3); i < n; i++) {
            System.out.println(workers.get(i).getID());
        }
    }
    public static void printWorkersList(ArrayList<Worker> workers) {
        int n = workers.size();
        Worker worker;
        for (int i = 0; i < n; i++) {
            worker = workers.get(i);
            System.out.println(worker.getID());
            System.out.println(worker.getName());
            System.out.println(worker.average_salary() + "\n");
        }
    }
    public static void writeToFile(ArrayList<Worker> workers, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            int n = workers.size();
            try {
                fileOutputStream.write(("" + n).getBytes());
                Worker worker;
                int type;
                for (int i = 0; i < n; i++ ) {
                    worker = workers.get(i);
                    if (worker.getClass().getName().equals("Worker_Hour")) {
                        type = 1;
                    }
                    else {
                        type = 0;
                    }
                    fileOutputStream.write(("\n\n" + type).getBytes());
                    fileOutputStream.write(("\n" + worker.getID()).getBytes());
                    fileOutputStream.write(("\n" + worker.getName()).getBytes());
                    fileOutputStream.write(("\n" + worker.getSalary()).getBytes());
                }
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
