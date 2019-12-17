package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static int ReadNumber(Scanner scanner, int left, int right) {
        int answer;
        while (true) {
            try {
                answer = scanner.nextInt();
                if (answer < left || answer > right) {
                    System.out.println("Incorrect answer, try once more");
                }
                else {
                    break;
                }
            }
            catch (Exception e) {
                System.out.println("Incorrect answer, try once more");
                scanner.nextLine();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(101);
        int left_bound = 0, right_bound = 100;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number between " +
                    left_bound + " and " + right_bound);
            int answer = ReadNumber(scanner, left_bound, right_bound);

            if (answer == number) {
                System.out.println("Gotcha! x = " + number);
                break;
            }
            else if (number < answer) {
                System.out.println("x is less than your answer");
                right_bound = answer - 1;
            }
            else {
                System.out.println("x is greater than your answer");
                left_bound = answer + 1;
            }
        }
    }
}
