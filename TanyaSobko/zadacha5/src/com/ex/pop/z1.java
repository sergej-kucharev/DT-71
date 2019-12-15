package com.ex.pop;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class z1 {
        static private class Str implements Comparable{
            private String innStr;
            Str(String s)
            {
                this.innStr = s;
            }
            public String getStr() {
                return innStr;
            }
            public int compareTo(Object obj) {

                Str arg0 = (Str) obj;
                return innStr.toLowerCase().compareTo(arg0.getStr().toLowerCase());
            }
        }

        public static void main(String[] args) throws IOException {

            ArrayList<Str> sortList = new ArrayList<Str>();

            Scanner in = new Scanner(new File("note.txt"));
            int i = 0;String[] slova = new String[15];
            while(in.hasNext())
            {
                slova[i] = in.next();
                i++;
            }

            for (int j = 0; j < i; j++)
            {
                sortList.add(new Str(slova[j]));
            }
            Collections.sort(sortList);
            System.out.println("\nОтсортированный список: ");
            sortList.forEach(Str -> {
                System.out.println(Str.getStr());
            });
        }
    }

