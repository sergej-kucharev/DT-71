package com.company;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> alfa = new ArrayList<>();
        ArrayList<Integer> beta = new ArrayList<>();
        int b = 200;
        int value;
        for (int i = 0; i<150;i++)
        {
            value = (int) (Math.random()*b + 1);
            alfa.add(i, value);
            //System.out.println(alfa.get(i));
            beta.add(i, alfa.get(i));
        }
        Collections.sort(beta);
        for (int i=0;i<135;i++)
        {
           // System.out.println(beta.get(i));
            beta.remove(0);
        }
        FileWriter file = new FileWriter( "file.txt" );
        for(int i=0; i<15; i++)
        {
            System.out.println(beta.get(i));
            file.write(beta.get(i) + " ");
        }
        file.close();

           }
}
