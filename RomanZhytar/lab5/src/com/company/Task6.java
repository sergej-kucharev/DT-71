package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer buffer = new StringBuffer();

        for (int j = str.length() - 1; j >= 0; --j) {
            buffer.append(str.charAt(j));
        }
        System.out.println(buffer.toString());
    }
}
