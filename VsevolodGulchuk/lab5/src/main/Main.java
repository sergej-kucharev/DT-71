package main;

import task3.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import task3.textio.*;
import task4.Task4;
import task5.Task5;
import task6.Task6;
import tasks12.Tasks12;

public class Main {

    public static void main(String[] args) {
        loop();
    }
    public static void loop(){
        boolean cont = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Vsevolod Gulchuk's 5th lab.");
        int taskNumber = 0;
        while(cont == true)
        {
            System.out.println("\n\n\t\tPlease, choose which task you want to see working: \n" +
                    "(enter 1, 2, 3, 4, 5 , 6 or exit to exit) \nFor example:\n1\nGo:");
            String taskNumberString = scan.nextLine();
            if (taskNumberString.equals("exit"))
                break;
            try{
                taskNumber = Integer.parseInt(taskNumberString);
            } catch (Exception ex)
            {
                System.out.println("You've entered bad value. Please try again:\n");
                continue;
            }
            switch (taskNumber){
                case 1:
                    Tasks12.task1();
                    break;
                case 2:
                    Tasks12.task2();
                    break;
                case 3:
                    Task3.task3();
                    break;
                case 4:
                    Task4.task4();
                    break;
                case 5:
                    Task5.task5();
                    break;
                case 6:
                    Task6.task6();
                    break;
                default:
                    System.out.println("You've entered bad value. Please try again:\n");
            }

        }
    }

}
