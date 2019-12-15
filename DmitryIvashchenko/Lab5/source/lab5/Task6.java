package lab5;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Task6 {
    public static void Task() throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in, "cp1251");
        PrintStream ps = new PrintStream(System.out, true, "cp1251");
        ps.println("Enter line:");
        String line = scanner.nextLine();
        StringBuilder builder = new StringBuilder(line.length());

        for(int i = 0; i < line.length(); i++) {
            builder.append(line.charAt(line.length() - i - 1));
        }

        String reversed = builder.toString();
        ps.println("Reversed line:");
        ps.println(reversed);
    }
}
