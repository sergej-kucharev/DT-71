package lab5;

import java.util.Comparator;

public class WorkerComporator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        if (o1.calculateSalary() < o2.calculateSalary()){
            return -1;
        }
        else if (o1.calculateSalary() > o2.calculateSalary()){
            return 1;
        }
        else if (o1.calculateSalary() == o2.calculateSalary()){
            return (o1.getName()).compareTo(o2.getName());
        }
        return 2;
    }
}
