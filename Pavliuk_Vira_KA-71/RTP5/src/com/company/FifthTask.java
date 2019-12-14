package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class FifthTask {
    public static void FifthTask(){
        String[] words = Read_File();
        Arrays.sort(words, new SortIgnoreCase());
        for(int i =0; i< words.length; i++)
            System.out.println(words[i]);
    }
    public static class SortIgnoreCase implements Comparator<Object> {
        public int compare(Object o1, Object o2) {
            String s1 = (String) o1;
            String s2 = (String) o2;
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        }
    }
    public static String[] Read_File() {
        try (FileReader reader = new FileReader("FifthTask_r.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 256) {
                    String.valueOf(c).replaceAll("\n","");
                    buf = Arrays.copyOf(buf, c);
                }
            }
            String.valueOf(buf).replaceAll("\n","");
            String[] words = String.valueOf(buf).split(" ");
            for (int i=0; i<words.length; i++)
            {
                words[i] =String.valueOf(words[i]).replaceAll("\n","");
            }
            return  words;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
