import java.util.Comparator;

public class Worker {
    int ID;
    String name;
    Worker(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    public double average_salary() {
        return 0;
    }
    public double getSalary() {
        return 0;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }

}
class CompareWorker implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Worker w1 = (Worker) o1;
        Worker w2 = (Worker) o2;
        double w1_as = w1.average_salary();
        double w2_as = w2.average_salary();
        if (w1_as == w2_as) {
            return w1.name.toLowerCase().compareTo(w2.name.toLowerCase());
        }
        else {
            if (w1_as > w2_as) return -1;
            if (w1_as < w2_as) return 1;
            return 0;
        }
    }
}
