//Напишіть гру Вгадайку. Програма за допомогою рандомізатора загадує ціле число від 0 до 100.
//Kористувач з консолі вводить передбачуване загадане число, програма повідомляє більше, менше або вгадав.
//Якщо користувач не вгадав, то програма пропонує спробувати вгадати знову в уточненому діапазоні
//(з урахуванням попередніх відповідей користувача (наприклад, "Менше, спробуйте в діапазоні [33, 88]".
//Не забувайте продумати захист від дурня.

import java.util.Scanner;
import java.util.*;
import java.io.*;

class Lab5{
    public static void main(String[] args){

        int answ = (int)Math.round((Math.random()*100));
        int leftborder = 0, rightborder = 100;
        int num = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("So, u need to guess the number from 0 to 100\n");

        boolean guessed = false;
        while(!guessed){

            while(true){
                try {
                    System.out.printf("Enter number from %d to %d: ", leftborder, rightborder);
                    num = in.nextInt();
                    break;
                }
                catch (Exception e)
                {
                    System.out.print("Incorrect input! ");
                    in.nextLine();
                }
            }

            if( num < leftborder || num > rightborder){
                System.out.printf("Don`t forget that number is between %d and %d\n", leftborder, rightborder);
            }
            else if(num > answ){
                System.out.printf("Number is lower than %d\n", num);
                rightborder = num-1;
            }
            else if(num < answ){
                System.out.printf("Number is bigger than %d\n", num);
                leftborder = num+1;
            }
            else if(num == answ){
                System.out.printf("You are right! It is " + num);
                guessed = true;
            }
        }
    }
}