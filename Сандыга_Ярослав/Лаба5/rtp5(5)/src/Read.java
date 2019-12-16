import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws FileNotFoundException {
        String s;
        ArrayList mat = new ArrayList();
        Scanner in = new Scanner(new File("Readme.txt"));
        while (in.hasNext()) {
            s = in.next();
            mat.add(s);
         //   System.out.print(s + " ");
        }
        Collections.sort(mat);
        System.out.println(mat);
        in.close();
    }
}
