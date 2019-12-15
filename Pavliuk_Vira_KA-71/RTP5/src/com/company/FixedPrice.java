package com.company;

public class FixedPrice extends Workers {
    double fix_month_rate;
    public FixedPrice(String n, int i, double f){
        super(n,i);
        fix_month_rate = f;
    }
    @Override
    public double MonthSalary() {
        super.salary=fix_month_rate;
        return fix_month_rate;
    }
}