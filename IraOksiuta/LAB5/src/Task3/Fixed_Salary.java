package Task3;

class Fixed_Salary extends Employee {

    private double SalaryPerMonth;

    Fixed_Salary(int id, String name, double salary) {
        super(name, id);
        this.SalaryPerMonth = salary;
    }

    @Override
    public double getSalaryPerMonth() {
        return SalaryPerMonth;
    }
    @Override
    public String writeToFile() {
        return String.format("f %d %s %f", ID,Name,SalaryPerMonth);
    }
}
