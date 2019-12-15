package com.ee.dt7;

import com.ee.dt7.com.ee.dt7.FixedWorkers;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class z3 {
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Workers> workrs = new ArrayList<Workers>(25);
        ArrayList<String> names = new ArrayList<String>(5);
        names.add("Nastya");
        names.add("Timoha");
        names.add("Valeriy");
        names.add("Albert");
        names.add("Victor");
        for (int i = 0; i < 10; i++) {

            workrs.add(new HourWorkers(names.get(i % 5), getRandomNumberInRange(10, 200), 1000 + i));
            workrs.add(new FixedWorkers(getRandomNumberInRange(200, 230000), names.get((i + 2) % 5), 1011 + i));

        }
        Collections.sort(workrs);
        System.out.println("Your best-love workers sorted: ");
        for (int i = 0; i < workrs.size(); i++) {
            System.out.println(workrs.get(i).id + " " + workrs.get(i).name + " " + workrs.get(i).salary());
        }
        System.out.println("\n\n" + "First five names from list:");
        for (int i = 0; i < 5; i++) {
            System.out.println(workrs.get(i).name);
        }
        System.out.println("\n\n" + "Last three id from list:");
        for (int i = workrs.size() - 3; i < workrs.size(); i++) {
            System.out.println(workrs.get(i).id);
        }
        Scanner in = new Scanner(new FileReader("note.txt"));
        int i = 0;
        try{
        while (in.hasNext()) {
            int index = in.nextInt();

            int id = in.nextInt();
            String n = in.next();
            double x = in.nextDouble();
            if(index==0) {
                workrs.add(new HourWorkers(n, x, id));
            }
            if(index==1){
                workrs.add(new FixedWorkers(x,n,id));
            }
            i++;
        }}
        catch(Exception e) {
            System.out.println("Bad input in file, you should place 4 fields in a row: 0. index(0 if hourWorker, 1 if FixedWorker) 1. id, 2. name, 3. salary");
        }
        // System.out.println(workrs.get(0).id);
        FileWriter fw = new FileWriter("res.txt");
        for (int j = 0; j < workrs.size(); j++) {
            fw.write(Integer.toString((workrs.get(j).getId())));
            fw.append(" ");
            // fw.write(String.format("bbb"));
            //fw.write(System.lineSeparator());
            fw.write(workrs.get(j).name);
            fw.append(" ");
            fw.write((workrs.get(j).salary()).toString());
            fw.write(System.lineSeparator());
            //fw.append("\n")
        }
        fw.close();
    }
}
