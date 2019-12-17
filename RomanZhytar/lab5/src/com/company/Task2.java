package com.company;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        var alpha = new Random().ints(150, 1, 200).boxed().collect(Collectors.toList());
        var beta = alpha.stream().sorted(Comparator.reverseOrder()).limit(15).collect(Collectors.toList());

        System.out.println("beta contents:");
        System.out.println(beta);

        try {
            Files.write(Paths.get("output.txt"), beta.toString().getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
