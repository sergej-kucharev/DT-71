package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem5 {

    public static void main(String[] args) throws FileNotFoundException {

        File input_file = new File("input_pr5");
        Scanner scan_file = new Scanner(input_file);
        TreeSet<String> input_data_set = new TreeSet<String>();
        while(scan_file.hasNext()){
            input_data_set.add(scan_file.next().replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase());
        }
        System.out.println(input_data_set);
        scan_file.close();
    }
}
