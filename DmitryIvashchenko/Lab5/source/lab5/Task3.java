package lab5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {
    private static void writeWorkersListToFile(ArrayList<Worker> workers, String filename) {
        try {
            PrintWriter writer = new PrintWriter(filename, "UTF-8");
            for (int i = 0; i < workers.size(); i++) {
                writer.println(workers.get(i).toFileString());
            }
            writer.close();
        } catch (Exception var5) {
            System.out.println("Can't write to file");
        }
    }

    private static ArrayList<Worker> readWorkersListFromFile(String filename) {
        ArrayList<Worker> workers = new ArrayList();
        File file = new File(filename);

        try {
            Scanner fileRead = new Scanner(file);

            while(fileRead.hasNext()) {
                workers.add(Worker.fromScanner(fileRead));
            }

            System.out.println("\nSuccessfully read information from " + filename);
        } catch (IOException var4) {
            System.out.println(var4.getMessage());
        }

        return workers;
    }

    public static void Task() {
        ArrayList<Worker> workers = new ArrayList<Worker>();
        workers.add(new SalaryWorker(1, "Barack", 14234));
        workers.add(new SalaryWorker(2,"George", 15945));
        workers.add(new WageWorker(3,"Abraham", 120));
        workers.add(new SalaryWorker(4,"John", 12726));
        workers.add(new WageWorker(5,"William", 92));
        workers.add(new WageWorker(6, "Donald", 72));

        String path = System.getProperty("java.class.path");
        String read = path + "\\lab5\\workers_from.txt";
        path = path + "\\lab5\\workers_to.txt";

        workers.sort(new WorkerComporator());
        workers.sort(Collections.reverseOrder(new WorkerComporator()));
        System.out.println("Task a:");
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(workers.get(i).toString());
        }
        System.out.println("Task b:");
        for (int i = 0; i < 5; i++) {
            System.out.println(workers.get(i).getName());
        }
        System.out.println("Task c:");
        for (int i = workers.size() - 1; i >= workers.size() - 3; i--) {
            System.out.println(workers.get(i).getId());
        }
        System.out.println("Task d:");
        writeWorkersListToFile(workers, path);

        ArrayList<Worker> workers2 = readWorkersListFromFile(read);

        for (int i = 0; i < workers2.size(); i++) {
            System.out.println(workers2.get(i).toString());
        }

        System.out.println();
    }
}
