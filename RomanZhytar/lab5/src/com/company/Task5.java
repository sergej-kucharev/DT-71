package com.company;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter the name of file:\n");

        String file_name;
        Scanner sin = new Scanner(System.in);
        file_name = sin.next();
        File input_file = new File(file_name);
        ArrayList<String> strings = new ArrayList<>();
        try {
            Scanner fin = new Scanner(input_file);
            while (fin.hasNext()) {
                strings.add(fin.next());
            }
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        strings.sort(String::compareToIgnoreCase);
        System.out.println(String.join(" ", strings));
    }
}
