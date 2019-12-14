package Task4;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static int[] tip(int rand, int guessed)
    {
        int e = Math.abs(rand - guessed);
        int lower = Math.max( (rand - 2 * e), 0),
            upper = Math.min( (rand + 2 * e), 100);

        return new int[] {lower, upper};
    }

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int rand = random.nextInt(101);

        System.out.println(
                "\nI`ve imagined an integer number between 0 and 100!\n" +
                "Try to guess it!\n");

        int i = 0;

        while (true)
        {
            try
            {
                System.out.println("Type here your guess:");
                int guessed_int = input.nextInt();

                if (guessed_int >= 0 && guessed_int <= 100)
                {
                    ++i;

                    if (rand > guessed_int)
                        System.out.println("\nMy number is larger");
                    else if (rand < guessed_int)
                        System.out.println("\nMy number is smaller");
                    else
                    {
                        System.out.println("\nMy dear, you won! Congrats!");
                        System.out.println("Your score: " + i + " attempts");
                        break;
                    }

                    if (i > 3)
                    {
                        int[] tip = tip(rand, guessed_int);
                        System.out.println("Try between " + tip[0] + " and " + tip[1]);
                    }
                }
                else
                    System.out.println("The number must be within 0 to 100 interval!\n");
            }
            catch (InputMismatchException e)
            {
                System.out.println("The input value must be int!\n");
                input.next();
            }
        }
    }
}
