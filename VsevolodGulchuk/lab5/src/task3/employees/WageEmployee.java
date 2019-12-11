package task3.employees;

public class WageEmployee extends AbstractEmplyee {
    private double wage;

    public WageEmployee(String name, int identifier, double wage) {
        super(name, identifier);
        this.wage = wage;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public Double getMounthlySalary() {
        return wage * 20.8 * 8;
    }

    @Override
    public String toString() {
        return "WageEmployee\n" +
                "name=" + getName() + "\n" +
                "wage=" + getWage() + "\n" +
                "identifier=" + getIdentifier();
    }
}
