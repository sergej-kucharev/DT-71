package com.company;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("output.txt");
        FileReader fr = new FileReader("output.txt");
        Scanner scan =new Scanner (fr);
        Worker[] people= new Worker[10];
        people[0]= new Hour("Tom", 1,1);
        people[1]=new Fix("Piotr",2,1);
        people[2]=new Hour("Carl",3,1);
        people[3]=new Fix("Olena", 4, 1);
        people[4]=new Hour("Derek", 5, 1);
        people[5]=new Fix("Sara",6,1);
        people[6]=new Hour("Alice", 7, 1);
        people[7]=new Fix("Mary",8,1);
        people[8]=new Hour("Alex",9,1);
        people[9]=new Fix("Anna",10,1);
        for(int i=0; i<people.length;i++) {
            people[i].CountSalary();
            people[i].WhoAmI();
        }
        System.out.println("~~~~~~~Sorting by Salary~~~~~~~");
        sort(people);
        System.out.println(               );
        print5name(people);
        System.out.println("\n");
        print3id(people);


        for(int i=0; i<people.length; i++)
        {
            fw.write(people[i].GetName()+" "+people[i].GetID()+" "+people[i].GetSalary()+"\n");
        }
        fw.close();
        Worker[] input= new Worker[10];
        System.out.println("array read from file");
        for(int i=0; i<input.length;i++)
        {
            String test=scan.nextLine();
            String[] words =test.split(" ");
            String name = words[0];
            int id=Integer.parseInt(words[1]);
            double salary = Double.parseDouble(words[2]);
            input[i]=new Fix(name,id,salary);
            input[i].WhoAmI();
        }
        fr.close();
    }
    //a
    static void sort(Worker[] p)
    {
        for(int i=0; i<p.length;i++) {
            for (int j = p.length-1; j > i; j--) {
                if (p[j - 1].GetSalary() < p[j].GetSalary()) {
                    Worker x = new Worker(p[j - 1].GetName(), p[j - 1].GetSalary(), p[j - 1].GetID());
                    p[j - 1] = new Worker(p[j].GetName(), p[j].GetSalary(), p[j].GetID());
                    p[j] = new Worker(x.GetName(), x.GetSalary(), x.GetID());
                }
            }
        }
        for(int i=0; i<p.length;i++){
            for(int j=p.length-1;j>i;j--){
                if(p[j-1].GetSalary()==p[j].GetSalary()){
                    if(p[j-1].GetName().compareTo(p[j].GetName())>0){
                        Worker x=new Worker(p[j-1].GetName(), p[j-1].GetSalary(), p[j-1].GetID());
                        p[j-1]= new Worker(p[j].GetName(), p[j].GetSalary(), p[j].GetID());
                        p[j]=new Worker(x.GetName(), x.GetSalary(), x.GetID());
                    }
                }
            }
        }
        for (int i=0; i<p.length; i++){ p[i].WhoAmI();}
    }
    //b
    static void print5name (Worker[] p){
        System.out.println("First 5 names from sort: ");
        for(int i=0; i<5;i++){
            System.out.println(p[i].GetName());
        }
    }
    //c
    static void print3id (Worker[] p){
        System.out.println("Last three id from sort: ");
        for(int i=p.length-3; i<p.length;i++){
            System.out.println(p[i].GetID());
        }
    }
}

class Worker{
    protected String name;
    protected double salary;
    protected int id;
    public Worker(String n, double s, int i ){
        name=n;
        salary=s;
        id=i;
    }
    public void WhoAmI(){
        System.out.println("ID: "+id+ " Name: "+name+" Salary:"+salary);
    }
    public void CountSalary(){}
    public String GetName(){return name; }
    public double GetSalary() { return salary; }
    public int GetID(){return id;}
}

class Hour extends Worker{
    public Hour(String n, int s, double h) {
        super(n, h, s);
    }
    public void CountSalary()
    {
        salary*=20.8*20;
    }
}

class Fix extends Worker{
    public Fix(String n, int i, double s){
        super(n,s,i);
    }
}


