package Task3;

abstract class Labor_force implements Comparable <Labor_force> {
    static int N = 0;
    double month_payment;
    String name;
    int id;

    Labor_force() {this.id = ++N;}

    public abstract void calc_payment();

    @Override
    public int compareTo(Labor_force labor_force) {

        int result = - Double.compare(this.month_payment, labor_force.month_payment);

        if (result == 0)
            result = this.name.compareTo(labor_force.name);

        return result;
    }

    @Override
    public String toString() {
        return    this.name + ',' +
                + this.month_payment + ',' +
                + this.id;
    }
}