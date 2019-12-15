package Task3;

class Worker_by_hour extends Labor_force {
    double wage;

    Worker_by_hour(double wage, String name) {
        this.wage = wage;
        this.name = name;
        calc_payment();
    }

    public void calc_payment() {
        this.month_payment = 20.8 * 8 * this.wage;
    }
}