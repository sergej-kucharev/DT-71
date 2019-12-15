package com.bored.dt3;

import java.util.Random;
import java.util.Scanner;

public class z4 {
    public static int getRandomIntBetweenRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public static int min(int a, int b)
    {
        return a>b?b:a;
    }
    public static int max(int a, int b)
    {
        return a<b?b:a;
    }

    public static void main(String[] args) {
        int secret = getRandomIntBetweenRange(0, 100);
        Scanner in = new Scanner(System.in);
        System.out.println("Испытайте интуицию(введите цифру от 1 до 100): ");
        int tryin = 0;
        do {
            while (in.hasNext()) {
                if (in.hasNextInt()) {
                    tryin = in.nextInt();
                }

                else{
                    System.out.println("Not found INT() value :"
                            + in.next());
                    System.out.println("My number was: "+secret);System.exit(0);
                }
                if(Math.abs(tryin-secret)>3){
            if (tryin > secret) {
                System.out.println("Your turn is bigger than my number!"+"Try in ["+getRandomIntBetweenRange(max((secret-10),0),(secret-1))+","+getRandomIntBetweenRange((secret+1),tryin)+"]");
            } else {
                System.out.println("Your turn is lesser than my number!"+" Try in ["+getRandomIntBetweenRange(tryin,(secret-1))+","+getRandomIntBetweenRange((secret+1),min((secret+10),100))+"]");

            }}
                else
                {
                    if (tryin > secret) {
                        System.out.println("You are so close!!But a little bit bigger");
                    }
                    if(tryin<secret){
                        System.out.println("You are so close!!But a little bit lesser");
                    }
                    if(tryin==secret){System.out.println("U ARE THE CHAMPION!"+" U guess that number, the number was: "+secret);System.exit(0);}
                }

        }}
        while (tryin != secret);
    }
}

