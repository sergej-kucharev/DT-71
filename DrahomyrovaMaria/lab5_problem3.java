package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Problem3 {

    public static void main(String[] args){

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new HourWork("Person_0",50000));
        people.add(new HourWork("Person_1",200));
        people.add(new HourWork("Person_2",60000));
        people.add(new FixedWork("Person_3",4000));
        people.add(new FixedWork("Person_4",34567));
        people.add(new FixedWork("Person_5",5777));
        people.add(new HourWork("Person_6",55000));

        people.sort(Person.ComparatorPerson);

        for (Person p : people) {
            System.out.println(p);
        }


        if (people.size() >= 5)
            for(int i = 0; i <5;i++ ){
                System.out.println(people.get(i).GetName());
            }

        if(people.size() >= 3)
            for(int i = people.size()-3; i <people.size(); i++ ){
                System.out.println(people.get(i).GetPersonId());
            }

        saveToFile(people,"output_pr3.txt");
    }

    public static void saveToFile(Collection<Person> collection, String fileName){
        try {
            FileWriter writer = new FileWriter(fileName);
            for (Person p : collection) {
                String lineForWriting = p.toString();
                writer.write(lineForWriting  +  System.getProperty("line.separator"));
            }
            writer.close();
        }catch (IOException e){
            System.out.println("Error with save");
        }
    }
}

abstract class Person{

    public static int id;
    protected int personID;
    protected String name;
    protected double salary;

    abstract double SalaryForMonth();
    public double GetSalary(){return salary;}
    public String GetName() {return name;}
    public static int GetId() {return id++ ;}
    public int GetPersonId() {return personID;}

    public int compareTo(Person compare) {

        double CompareSalary = ((Person) compare).GetSalary();
        if(this.salary != CompareSalary) {
            return (int)(this.salary - CompareSalary);
        }
        else {
            return compare.GetName().compareTo(this.name);
        }


    }

    public static Comparator<Person> ComparatorPerson = new Comparator<Person>() {
        public int compare(Person p1, Person p2)
        {
            return p2.compareTo(p1);
        }
    };

}

class HourWork extends Person{

    private double salary_hour;

    public HourWork(String name, double salary_hour){
        this.name=name;
        this.salary_hour=salary_hour;
        salary=SalaryForMonth();
        personID=Person.GetId();

    }

    @Override
    double SalaryForMonth(){
        return 20.8*8*salary_hour;
    }

    @Override
    public String toString() {
        return "Name: " + name + " \n" + "ID: " + personID + " \n" + "Salary per hour: " + salary_hour + " \n" + "Total salary: " + salary;
    }

    public double Getsalary_hour() {
        return salary_hour;
    }
}

class FixedWork extends Person{

    private double SalFix;

    public FixedWork(String name, double SalFix){
        this.name=name;
        this.SalFix=SalFix;
        salary=SalaryForMonth();
        personID=Person.GetId();

    }

    @Override
    double SalaryForMonth(){
        return SalFix;
    }

    @Override
    public String toString() {
        return "Name: " + name + " \n" + "ID: " + personID + " \n" + "Total salary: " + salary;
    }

    public double GetFixSal() {
        return SalFix;
    }
}
