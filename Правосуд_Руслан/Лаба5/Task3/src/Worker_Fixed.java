import java.io.Serializable;

public class Worker_Fixed extends Worker implements Serializable {
    double salary;
    Worker_Fixed(int ID, String name, double salary) {
        super(ID, name);
        this.salary = salary;
    }

    @Override
    public double average_salary() {
        return salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
