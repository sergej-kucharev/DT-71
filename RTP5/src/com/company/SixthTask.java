package com.company;

import java.util.Scanner;

public class SixthTask {
    public static void SixthTask(){
        System.out.println("Enter you message");
        char[] text = null;
        String stext = new Scanner(System.in).nextLine();
        char[] new_text = new char[stext.length()];
        text=stext.toCharArray();
        for(int i=0; i<stext.length(); i++){
            new_text[stext.length()-1-i] = text[i];
        }
        System.out.println(new_text);
    }
}
