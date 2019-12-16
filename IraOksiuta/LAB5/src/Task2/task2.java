package Task2;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;
import java.lang.*;

public class task2 {
    public static void main() {
        int beta_size=15;
        int alpha_size= 200;
        List<Integer> Alpha = new ArrayList<Integer>();
        Random r = new Random();
        for (int x = 0; x < alpha_size+1; x++) {
            Alpha.add(r.nextInt((alpha_size- 1) + 1) + 1);
        }
        List<Integer> A1=new ArrayList<Integer>(Alpha);
        Collections.sort(A1);
        Collections.reverse(A1);
        List<Integer> Beta = A1.subList(0,beta_size);
        System.out.println(Beta);
        try {
            PrintWriter writer = new PrintWriter("task2_output.txt", "UTF-8");
            Beta.forEach(writer::println);
            writer.close();
        }
        catch (Exception e) {}
    }
}
