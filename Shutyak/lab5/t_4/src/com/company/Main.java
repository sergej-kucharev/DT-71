package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int input(int a, int b){
        int i = 0;
        boolean flag = true;
        while (flag) {
            try {
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
                if ((i >= a) && (i <= b)) flag = false;
                else  System.out.println("answer is not in range");
            } catch (Exception e) {
                System.out.println("Not a answer");
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int low = 0;
        int up = 100;
        int answer =rand.nextInt(up-low+1)+low;
        int player = input(low, up);
        while (player != answer){
            if ((player-answer) > 0) {
                low = (int)(rand.nextInt(answer-low+1)*0.8) + low;
                up = player;
                System.out.println(String.format("Lower, hint: the answer is in range [%d;%d]", low, up));
            }
            else{
                up = (int)(rand.nextInt(up-answer+1)) + answer;
                low = player;
                System.out.println(String.format("Higher, hint: the answer is in range [%d;%d]", low, up));
            }
            player = input(low, up);
        }
        System.out.println("\n" +
                " _______                                          _              _                  _ \n" +
                "(_______)                               _        | |         _  (_)                | |\n" +
                " _       ___  ____   ____  ____ _____ _| |_ _   _| | _____ _| |_ _  ___  ____   ___| |\n" +
                "| |     / _ \\|  _ \\ / _  |/ ___|____ (_   _) | | | |(____ (_   _) |/ _ \\|  _ \\ /___)_|\n" +
                "| |____| |_| | | | ( (_| | |   / ___ | | |_| |_| | |/ ___ | | |_| | |_| | | | |___ |_ \n" +
                " \\______)___/|_| |_|\\___ |_|   \\_____|  \\__)____/ \\_)_____|  \\__)_|\\___/|_| |_(___/|_|\n" +
                "                   (_____|                                                            \n");
    }
}