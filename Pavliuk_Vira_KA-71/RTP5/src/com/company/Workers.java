package com.company;

import java.util.Comparator;

public abstract class Workers {
    String name = new String();
    int id;
    double salary;
    public Workers(String n, int i){
        name = n;
        id = i;
    }
    public abstract double MonthSalary();
    public static final Comparator<Workers> COMPARE_BY_NAME = new Comparator<Workers>() {
        @Override
        public int compare(Workers lhs, Workers rhs) {
            return lhs.name.compareTo(rhs.name);
        }
    };
    public static final Comparator<Workers> COMPARE_BY_SALARY = new Comparator<Workers>() {
        @Override
        public int compare(Workers lhs, Workers rhs) {
            return (int) (lhs.salary - rhs.salary);
        }
    };
}
