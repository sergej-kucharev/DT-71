package lab5;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void Task() {
        System.out.println("Guess the number between 0 and 100\n");
        Random random = new Random();
        int number = random.nextInt(100);
        boolean guessed = false;
        int guess = 0;
        int lower = 0, upper = 100;
        Scanner in = new Scanner(System.in);
        while (!guessed) {
            try {
                String str = in.nextLine();
                guess = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input");
                continue;
            }
            if (guess > 100 || guess < 0) {
                System.out.println("Wrong input");
                continue;
            }
            guessed = (guess == number);
            if (guess > lower && guess < upper) {
                if (number > guess) {
                    lower = guess;
                } else {
                    upper = guess;
                }
            }
            if (!guessed) {
                System.out.println("Lower bound: " + lower + ", upper bound: " + upper);
            } else {
                System.out.println("You win!");
            }
        }
    }
}
