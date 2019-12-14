package Task2;
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> alpha = new ArrayList<>();
        for (int i = 0; i < 150; i++) {
            alpha.add(1 + (int) (Math.random() * 200));
        }

        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(0, alpha);
        Collections.sort(temp);
        Collections.reverse(temp);

        List<Integer> beta = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            beta.add(temp.get(i));
        }

        temp.clear();
        System.out.println(beta);

        FileWriter fileOut = new FileWriter("beta.txt");
        for (int i = 0; i < 15; i++) {
            fileOut.write(Integer.toString(beta.get(i)));
            fileOut.write(' ');
        }
        fileOut.close();
    }
}