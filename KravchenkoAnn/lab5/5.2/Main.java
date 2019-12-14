package com.company;

import java.io.FileWriter;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        FileWriter fr = new FileWriter("text.txt");
        ArrayList<Integer> alpha = new ArrayList<Integer>();
        for (int i = 0; i < 150; i++)
            alpha.add(i, (int) (Math.random() * 200));
        ArrayList<Integer> beta = new ArrayList<Integer>();
        for (int i=0;i<150;i++)
            beta.add(i, alpha.get(i));
        for (int i = 0; i < beta.size(); i++)
            System.out.println(beta.get(i));
        Collections.sort(beta);
        for (int i = 0; i<135; i++)
            beta.remove(0);
        for(int i=14;i>=0;i--){
            System.out.println("   sort   " +beta.get(i));
            fr.write(beta.get(i)+"\n");
        }
        fr.close();
    }
}