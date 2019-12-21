package com.company;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        System.out.println("Enter your line");
        Scanner user_input = new Scanner(System.user_input);
        String next_string = user_input.next();
        String next_substring ="";
        for (int i = next_string.length(); i > 0; i--)
            next_substring += next_string.substring(i-1, i);
        System.out.println(next_substring);
    }
}
