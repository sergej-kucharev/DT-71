package com.company;
import java.util.Scanner;
import java.io.Reader;
import java.io.*;

public class Main {

    public static void main(String[] args){
        System.out.println("Enter your text");
        String text;
        Scanner k = new Scanner(System.in);
        text = k.nextLine();
        char[] text1 = text.toCharArray();
        for(int i = text1.length-1 ; i >=0; i-- )
        {
            System.out.print(text1[i]);
        }
    }
}
