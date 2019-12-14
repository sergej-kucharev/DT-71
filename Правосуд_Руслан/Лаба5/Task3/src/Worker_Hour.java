import java.io.Serializable;

public class Worker_Hour extends Worker implements Serializable {
    double per_hour;
    Worker_Hour(int ID, String name, double per_hour) {
        super(ID, name);
        this.per_hour = per_hour;
    }

    @Override
    public double average_salary() {
        return per_hour * 8 * 20.8;
    }

    @Override
    public double getSalary() {
        return per_hour;
    }
}
