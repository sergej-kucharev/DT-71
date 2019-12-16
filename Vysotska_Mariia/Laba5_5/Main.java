package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String text1 = null;
        FileReader reader = new FileReader("file5_5.txt");
        Scanner skan = new Scanner(reader);
        do{
            text1 += skan.nextLine();
        }
        while(skan.hasNextLine());
        System.out.println(text1);
        String[] word;
        String del = " ";
        word = text1.toString().split(del);
        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[j].compareToIgnoreCase(word[i]) < 0) {
                    String temp = word[j];
                    word[j] = word[i];
                    word[i] = temp;
                }
            }
            if(word[i].compareToIgnoreCase("a") < 0){word[i]= null;}
        }
        for(int i = 0; i<word.length; i++) {
            if(word[i] != null )
            {
                System.out.print(word[i]+" ");
            }
        }
        reader.close();
    }
}
