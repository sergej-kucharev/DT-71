package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int b = 100;
        int value = (int) (Math.random()*b);
        System.out.println(value);
        int n, a1 = 0, b1 = 100;
        int a = 0;
        do
        {
            System.out.print("Write a number  ");
            Scanner k = new Scanner(System.in);
            n = k.nextInt();
            if(n>b1|| n<a1)
            {
                System.out.println("Your value must be [" + a + ";" + b + "]. Try again!!!\n");
                continue;
            }
            if (n > value)
            {
                b = n - 1;
                a = (int)(Math.random()*value);
                if (a < a1) { a = a1; }
                if (b > 100 || b > b1) { b = b1; }
                System.out.println("The value is <\n");
                System.out.println("Try value [" + a + "," + b + "]");
            }
            else if(n<value)
            {
                b = (int)(value + Math.random()*100);
                if (b > 100 || b > b1) { b = b1; }
                a = n + 1;
                if (a < a1) { a = a1; }
                System.out.println("The value is <\n");
                System.out.println("Try value [" + a + "," + b + "]");

            }
            a1 = a;
            b1 = b;
        }
        while (n != value);
        System.out.println("You are WINNER");
    }
}
