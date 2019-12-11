package task3.employees;

public class SalaryEmployee extends AbstractEmplyee {
    private double salary;

    public SalaryEmployee(String name, int identifier, double salary) {
        super(name, identifier);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public Double getMounthlySalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "SalaryEmployee\n" +
                "name=" + getName() + "\n" +
                "salary=" + getSalary() + "\n" +
                "identifier=" + getIdentifier();
    }
}
