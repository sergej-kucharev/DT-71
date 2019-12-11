package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task2 {

    static void push_beta_to_file(List<Integer> list) throws IOException
    {
        FileWriter fw = new FileWriter("beta.txt");

        for (Integer i : list) {
            fw.write(i.toString() + ' ');
        }

        fw.flush();
        fw.close();
    }

    public static void main(String[] args) throws IOException {

        Random random = new Random();
        List<Integer> alpha = new ArrayList<Integer>(),  beta = new ArrayList<Integer>();

        for (int i=0; i<150; i++)
            alpha.add(1 + random.nextInt(200));

        for (Integer i: alpha)
        {
            if (beta.size() < 16)
            {
                beta.add(i);
                Collections.sort(beta);
            }
            else
            {
                if (i > beta.get(0))
                {
                    beta.set(0, i);
                    Collections.sort(beta);
                }
            }
        }

        System.out.println("results:");
        for (Integer i: beta)
            System.out.print(i + ", ");

        System.out.println("\ntrue:");
        Collections.sort(alpha);
        for (Integer i: alpha.subList(134,150))
            System.out.print(i + ", ");

        push_beta_to_file(beta);
    }

}
