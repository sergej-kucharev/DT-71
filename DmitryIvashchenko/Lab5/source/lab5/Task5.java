package lab5;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void Task() throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in, "cp1251");
        PrintStream ps = new PrintStream(System.out, true, "cp1251");
        ArrayList<String> words = new ArrayList();
        boolean answer = true;

        while(answer) {
            ps.println("Enter text:");
            words.add(scanner.next());
            ps.println("Do you want to continue? (Y - yes, N - no)");
            String input;
            do {
                input = scanner.next();
                if(input.equals("Y")) {
                    break;
                }
                else if (input.equals("N")) {
                    answer = false;
                    break;
                }
            } while(true);
        }

        words.sort(new AlphabeticalOrderComparator());
        ps.println("\nSorted words: \n");

        for(int i = 0; i < words.size(); i++) {
            ps.println(words.get(i));
        }
    }
}
