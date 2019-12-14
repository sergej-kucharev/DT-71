package com.ee.dt7;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class HourWorkers extends Workers implements Serializable
{

    double hStavka;

    HourWorkers(String n,double money, int id)
    {
     this.name=n;
     this.hStavka=money;
     this.id = id;
    }
@Override
    public Double salary() {
    return 20.8 * 8 * hStavka;
    }

}
