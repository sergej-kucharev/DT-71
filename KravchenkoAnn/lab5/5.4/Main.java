package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mystery=(int)(Math.random()*100);
        Scanner in=new Scanner(System.in);
        int num;
        int a=0, b=100, i=1;
        System.out.println("Welcome to my game! I'm thinking about number between 0 and 100.Try to guess what is it:)");
        do{
            System.out.println("Enter your number: ");
            num=in.nextInt();
            while(num<a || num>b){
                System.out.println("You entered unacceptable number, now stop joking and enter number between 0 and 100");
                num = in.nextInt();
            }
            if (num > mystery) {
                System.out.println(num + " is bigger then my number.Try again)");
                b = num;
                System.out.println("Try to guess number between " + a + " and " + b);
            } else if (num == mystery) {
                System.out.println(num + " is my number.Congratulations!!!");
                System.out.println("You guessed my number from "+i+" attempts");
                //break;
            } else if (num < mystery) {
                System.out.println(num + " is less then my number.Try again)");
                a=num;
                System.out.println("Try to guess number between " + a + " and " + b);
            }
            i++;
        }while (num!=mystery);
        in.close();
    }
}
