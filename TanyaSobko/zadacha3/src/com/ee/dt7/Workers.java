package com.ee.dt7;

public abstract class Workers implements Comparable {
    public int id;
    public String name;

    Workers(String n, int id) {
        this.name = n;
        this.id = id;
    }

    protected Workers() {
        name = " ";
        id = 0;
    }
    public int getId()
    {
        return this.id;
    }

    public abstract Double salary();

    public int compareTo(Object o) {
        Workers w = (Workers)o;

        if (w.salary().compareTo(this.salary()) == 0) return this.name.compareTo(w.name);
        else return w.salary().compareTo(this.salary());
        // public abstract Double salary();
    }
}

