package com.company;

public class HourWage extends Workers {
    double rate;
    public HourWage(String n, int i, double r){
        super(n,i);
        rate = r;
    }
    @Override
    public double MonthSalary() {
        //«середньомісячна заробітна плата = 20.8 * 8 * погодинну ставку»
        super.salary = 20.8 * 8 * rate;
        return (20.8 * 8 * rate);
    }
}