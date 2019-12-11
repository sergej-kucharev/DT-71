package task6;

import java.util.Scanner;

public class Task6 {
    public static void task6()
    {
        System.out.println("TASK6");
        System.out.println("Please type the line which will be reversed: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Reversed line looks like: ");
        for(int i = str.length() - 1 ; i >= 0; i--)
            System.out.print(str.substring(i, i+1));
        System.out.println("");
        System.out.println("End of TASK6");
    }
}
