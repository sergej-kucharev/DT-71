package Task5;

import java.util.ArrayList;
import java.lang.*;
import java.util.Scanner;
public class task5 {
    public static void main() {
        ArrayList<String> text = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter text, press ctrl + D to finish: \n");
        while (sc.hasNext())
            text.add(sc.next());
        text.sort(new CustomComparator());
        System.out.println("Sorted text: ");
        for (int i=0; i<text.size();i++)
            System.out.println(text.get(i));
    }
}
