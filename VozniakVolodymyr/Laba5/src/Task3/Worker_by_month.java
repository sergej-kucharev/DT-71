package Task3;

class Worker_by_month extends Labor_force {
    double salary;

    Worker_by_month(double salary, String name) {
        this.salary = salary;
        this.name = name;
        calc_payment();
    }

    public void calc_payment() {
        this.month_payment = salary;
    }
}