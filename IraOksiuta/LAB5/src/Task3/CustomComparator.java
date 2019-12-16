package Task3;
import java.util.Comparator;

public class CustomComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1,Employee e2){
        if (e1.getSalaryPerMonth() - e2.getSalaryPerMonth() > 0) return 1;
        else if (e1.getSalaryPerMonth() - e2.getSalaryPerMonth() < 0) return -1;
        return e1.getName().compareTo(e2.getName());
    }

}
