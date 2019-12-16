package Task4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task4 {

    public static boolean check(int number, int min ,int max){
        if (number<=max && number>=min)
            return true;
        else return false;
    }

    public static boolean conclusion(int x, int num) {
        boolean a=true;
        if(num<x) {
            System.out.println("Upper!");
            a=false;
        }
        if (num>x){
            System.out.println("Under!");
            a=false;
        }
        if(num==x)System.out.println("YOU WON!!!!!!!!!!!");
        return a;
    }
    public static ArrayList<Integer> interval(int x,int number){
        ArrayList<Integer> interval=new ArrayList<Integer>();
        int K=Math.abs(x-number);
        if(x-K<1)
        interval.add(1);
        else interval.add(x-K);
        if(x+K>100)
            interval.add(100);
        else interval.add(x+K);
        System.out.println("Try in interval ["+ interval.get(0)+","+interval.get(1)+"]. Good luck!");
        return interval;
    }

    public static void main(){
        Random r = new Random();
        int X=r.nextInt((100- 1) + 1) + 1;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> interval=new ArrayList<Integer>();
        interval.add(1);
        interval.add(100);
        int number, left=1, right=100;
        while (true){
            System.out.println("Enter number");
            number=sc.nextInt();
            while(check(number,interval.get(0),interval.get(1))!=true) {
                System.out.println("Your number doesn't belong to interval( Try again! Enter number");
                number = sc.nextInt();
            }
            if(conclusion(X,number)) break;
            interval= interval(X,number);
        }
    }
}
