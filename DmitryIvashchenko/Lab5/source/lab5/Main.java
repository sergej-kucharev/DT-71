package lab5;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess = -1;
        System.out.println("Choose task, use numbers from 1 to 6:");
        try {
            String str = in.nextLine();
            guess = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Wrong input");
            return;
        }
        switch (guess) {
            case (1):
                Task1.Task();
                break;
            case (2):
                Task2.Task();
                break;
            case (3):
                Task3.Task();
                break;
            case (4):
                Task4.Task();
                break;
            case (5):
                try {
                    Task5.Task();
                } catch (UnsupportedEncodingException ex) {
                    System.out.println("Encoding doesn't support");
                }
                break;
            case (6):
                try {
                    Task6.Task();
                } catch (UnsupportedEncodingException ex) {
                    System.out.println("Encoding doesn't support");
                }
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
        return;
    }
}
