package com.bored.dt4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class z2 {
    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public static void main(String[]args)
    {
        List<Integer> alpha = new ArrayList<Integer>(150);
        List<Integer> beta = new ArrayList<Integer>(150);
        for(int i = 0; i < 150; i++)
        {
            alpha.add(getRandomNumberInRange(1,200));
            beta.add(alpha.get(i));
        }
        Collections.sort(beta);
        beta.subList(15,beta.size()).clear();
        try(FileWriter writer = new FileWriter("notes3.txt"))
        {

            for(int i = 0; i < beta.size();i++) {
                writer.write(beta.get(i).toString());

                writer.append('\n');
        }
            writer.close();
        }
        
        catch(IOException ex){

            System.out.println(ex.getMessage());}

        for(int i = 0; i < beta.size(); i++)
        {
            System.out.println(beta.get(i));
        }



    }
}
