package com.company;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FourthTask {
    public static void FourthTask(){
        Random randNumber = new Random();
        int iNumber = randNumber.nextInt(100) + 1;
        int a=-1,b=101;
        while (true) {
            System.out.println("Enter number:");
            String cmd = new Scanner(System.in).nextLine();
            if (cmd.matches("\\D+$")) continue;
            try{
                int num = Integer.parseInt(cmd);
                if (num == iNumber) {
                    System.out.println("Yeah");
                    break;
                } else if (num < iNumber) {
                    System.out.println("too Low");
                    if (a < num) a = num;
                } else {
                    System.out.println("too High");
                    if (b > num) b = num;
                }
                if (a > -1 && b < 101) System.out.println("Try in [" + a + " , " + b +"]");
            }
            catch(Exception eo){
                System.out.println("Try one more time");
            }
        }
    }

}
