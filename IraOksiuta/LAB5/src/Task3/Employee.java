package Task3;
import java.util.Scanner;
import java.io.IOException;
abstract class Employee {
    String Name;
    int ID;

    Employee(String name, int id) {
        this.Name = name;
        this.ID = id;
    }

    public String getName() {
        return Name;
    }

    abstract double getSalaryPerMonth();
    abstract String writeToFile();

    public String print() {
        return String.format("ID: %d,\tName: %s,\tMonthly salary: %f", ID, Name, getSalaryPerMonth());
    }

    static Employee createEmployee(Scanner scanner) throws IOException {
        String type=scanner.next();
        int ID=scanner.nextInt();
        String name=scanner.next();
        double salary=scanner.nextDouble();
        if (type.equals("f")) return new Fixed_Salary(ID, name, salary);
        if (type.equals("h")) return new Hourly_Wage(ID, name, salary);
        throw new IOException("incorrect input");
    }

}
