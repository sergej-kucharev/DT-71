package lab5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    public static void Task() {
        ArrayList<Integer> alpha = new ArrayList();
        int min = 100;
        int max = 200;
        int alphaCapacity = 150;
        int betaCapacity = 15;

        for (int i = 0; i < alphaCapacity; i++) {
            Random random = new Random();
            alpha.add(random.nextInt(max - min + 1) + min);
        }

        ArrayList<Integer> alphaCopy = new ArrayList(alpha);
        Collections.sort(alphaCopy, Collections.reverseOrder());

        ArrayList<Integer> beta = new ArrayList();
        for (int i = 0; i < betaCapacity; i++){
            beta.add(i, alphaCopy.get(i));
        }

        String path = System.getProperty("java.class.path");

        System.out.println(beta);
        try (final FileWriter file = new FileWriter(path + "\\lab5\\Task2.txt", false))
        {
            file.write(beta.toString());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
