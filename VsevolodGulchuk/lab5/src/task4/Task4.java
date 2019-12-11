package task4;

import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    static int upperBound=100;
    static int lowerBound=0;
    static int number = (int)(Math.random()*101);
    public static void task4()
    {
        System.out.println("TASK4");
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Try to guess the integer in [0; 100] interval: ");
                int attempt = scanner.nextInt();
                if(attempt == number)
                {
                    System.out.println("You won))");
                    break;
                }
                if( attempt < lowerBound || attempt > upperBound){
                    System.out.println("Rememeber, you know that number is in [" +
                            lowerBound + ", " + upperBound + "] intervar. Try again: ");
                    continue;
                }
                if (attempt < number){
                    lowerBound = attempt + 1;
                }
                if (attempt > number){
                    upperBound = attempt - 1;
                }
                System.out.println("Not bad. Continue finding in the [" +
                        lowerBound + ", " + upperBound + "] interval. Try Again: ");
            }
        }
        catch (Exception ex)
        {
            System.out.println("Sorry, you've entered non-integer value. Game will end. " +
                    "You can choose task 4 again in order to try again");
        }
        System.out.println("End of TASK4");
    }
}
