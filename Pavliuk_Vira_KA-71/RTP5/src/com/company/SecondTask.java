package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SecondTask {
    public static void SecondTask() {
        List<Integer> alpha = new LinkedList<Integer>();
        List<Integer> beta = new LinkedList<Integer>();
        for (int i = 0; i < 150; i++) {
            Random randNumber = new Random();
            int iNumber = randNumber.nextInt(200) + 1;
            if (!alpha.contains(iNumber)) {
                alpha.add(iNumber);
            } else {
                i--;
            }
        }
        for(int j =0; j < 15; j++) {
            int max = alpha.get(0);
            for (int i = 0; i < 150; i++) {
                if (max < alpha.get(i) && !beta.contains(alpha.get(i))) max = alpha.get(i);
            }
            beta.add(max);
            System.out.println(beta.get(j));
        }
        try(FileWriter writer = new FileWriter("SecondTask_betta.txt", false))
        {
            for(int i=0; i<15; i++) {
                writer.write(beta.get(i).toString());
                writer.append('\n');
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
