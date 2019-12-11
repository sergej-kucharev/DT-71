package task3.employees;

import java.util.Comparator;

public abstract class AbstractEmplyee {
    private String name;
    private int identifier;

    public AbstractEmplyee() {
        name = "default";
        identifier = 0;
    }

    public AbstractEmplyee(String name) {
        this.name = name;
    }

    public AbstractEmplyee(String name, int identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Emplyee{" +
                "name='" + name + "', " +
                "mounthlySalary=" + getMounthlySalary() + ", " +
                "identifier=" + getIdentifier() +
                '}';
    }

    public abstract Double getMounthlySalary();

    public static class EployeesComparator implements Comparator<AbstractEmplyee>
    {
        @Override
        public int compare(AbstractEmplyee o1, AbstractEmplyee o2) {
            int SalaryCompare = -o1.getMounthlySalary().compareTo(o2.getMounthlySalary());
            int NameCompare = o1.getName().compareTo(o2.getName());
            if(SalaryCompare != 0){
                return SalaryCompare;
            }
            return NameCompare;
        }
    }

}
