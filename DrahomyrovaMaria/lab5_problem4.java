package com.company;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        int i = (int) (Math.random() * 100);
        Scanner in = new Scanner(System.in);
        int j = -1;
        int a = 0;
        int b = 100;
        try {
            while (j != i) {
                System.out.println("Enter number from interval [" + a + ";" + b + "]");
                j = in.nextInt();
                if ((j <= b) && (j >= a)) {
                    if (i > j) {
                        System.out.println("Number is bigger");
                        a = j;
                    } else if (i < j) {
                        System.out.println("Number is smaller");
                        b = j;
                    } else System.out.println("You guessed right");
                }
            }
        }
        catch(Exception e) {
            System.out.println("Wrong format");
        }
    }
}
