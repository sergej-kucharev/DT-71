package com.ee.dt7.com.ee.dt7;

import com.ee.dt7.Workers;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class FixedWorkers extends Workers implements Serializable
{
    double fixedSalary;
    public FixedWorkers(double money, String n, int id)
    {
        this.fixedSalary = money;
        this.name = n;
        this.id = id;
    }
    @Override
    public Double salary() {
        return fixedSalary;
    }

}
