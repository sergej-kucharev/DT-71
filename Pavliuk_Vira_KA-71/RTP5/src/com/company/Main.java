package com.company;

import java.util.*;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        int j=0;
        System.out.println("Choose the task(1,2,3,4,5,6): ");
        while(true) {
            try {
                String t = new Scanner(System.in).nextLine();
                j = Integer.parseInt(t);
                if (j>0 && j<7) break; else throw new Exception("");
            } catch (Exception e) {
                System.out.println("Incorrect input");
                continue;
            }
        }
        if (j == 1){
            FirstTask task1 = new FirstTask();
            task1.FirstTask();
        };
       if (j==2){
           SecondTask task2 = new SecondTask();
           task2.SecondTask();
       }
       if (j==3){
           ThirdTask task3 = new ThirdTask();
           task3.ThirdTask();
       }
       if (j==4){
            FourthTask task4 = new FourthTask();
            task4.FourthTask();
       }
       if (j==5){
           FifthTask task5 = new FifthTask();
           task5.FifthTask();
       }
       if (j==6) {
           SixthTask task6 = new SixthTask();
           task6.SixthTask();
       }
    }

}
