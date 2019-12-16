package Task3;

class Hourly_Wage extends Employee {

    private double SalaryPerHour;

    Hourly_Wage(int id, String name, double salary) {
        super(name, id);
        this.SalaryPerHour = salary;
    }

    @Override
    public double getSalaryPerMonth() {
        return SalaryPerHour*8*20.8;
    }

    @Override
    public String writeToFile() {
        return String.format("h %d %s %f", ID,Name,SalaryPerHour);
    }
}
