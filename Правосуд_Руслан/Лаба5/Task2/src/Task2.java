import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Task2 {

    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 150; i++) {
            arrayList.add(i);
        }
        letsDoIt(arrayList);
    }
    public static void letsDoIt (List<Integer> alpha) {
        int n = alpha.size();
        if (n != 150) {
            System.out.println("Incorrect list size");
            return;
        }
        ArrayList<Integer> beta = new ArrayList<>();
        ArrayList<Boolean> used = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            alpha.set(i, 1 + rand.nextInt(200));
            used.add(false);
        }
        int count = 15;
        while (count-->0) {
            int ind_max = 0;
            for (int i = 1; i < n; i++) {
                if (used.get(i) == true) {
                    continue;
                }
                if (alpha.get(i) > alpha.get(ind_max)) {
                    ind_max = i;
                }
            }
            used.set(ind_max, true);
            beta.add(alpha.get(ind_max));
        }
        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream(new File("out.txt"));
            n = 15;
            try {
                for (int i = 0; i < n; i++) {
                    System.out.println(beta.get(i));
                    fileOutputStream.write((beta.get(i) + "\n").getBytes());
                }
                fileOutputStream.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
