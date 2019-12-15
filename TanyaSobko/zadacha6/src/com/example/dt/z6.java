package com.example.dt;

import java.util.Scanner;

public class z6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to reverse: ");
        String t = input.next();
        char[] s = new char[t.length()];
        for (int i = 0; i < t.length(); i++) {
            s[i] = t.charAt(t.length() - i - 1);
        }
        t = new String(s);
        System.out.println(t);
    }
}
