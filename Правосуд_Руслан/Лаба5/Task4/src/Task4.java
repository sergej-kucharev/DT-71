import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(101);
        int left_bound = 0, right_bound = 100;
        int answer;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number between " +
                    left_bound + " and " + right_bound);
            while (true) {
                try {
                    answer = scanner.nextInt();
                    if (answer < left_bound || answer > right_bound) {
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
            if (answer == number) {
                System.out.println("You are right! The number is " + number);
                break;
            }
            else if (number < answer) {
                System.out.println("The number is less than your answer");
                right_bound = answer - 1;
            }
            else {
                System.out.println("The number is greater than your answer");
                left_bound = answer + 1;
            }
        }
    }
}
