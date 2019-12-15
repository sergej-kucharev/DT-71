package lab5;

import java.io.IOException;
import java.util.Scanner;

public abstract class Worker {
    String name;
    int id;
    abstract double calculateSalary();

    String getName() {
        return this.name;
    }

    Worker setName(String name) {
        this.name = name;
        return this;
    }

    int getId() {
        return this.id;
    }

    Worker setId(int id) {
        this.id = id;
        return this;
    }

    static Worker fromScanner(Scanner scanner) throws IOException {
        String type = scanner.next();
        int id = scanner.nextInt();
        String name = scanner.next();
        double income = scanner.nextDouble();
        if (type.equals("w")) {
            return new WageWorker(id, name, income);
        } else if (type.equals("s")) {
            return new SalaryWorker(id, name, income);
        } else {
            throw new IOException("Income type undefined");
        }
    }

    public String toString() {
        return String.format("id: %d\tname: %s\tmonthly salary: %f", this.id, this.name, this.calculateSalary());
    }

    public abstract String toFileString();
}
