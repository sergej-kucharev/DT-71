package com.example.dt.com.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class dt2 {
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
    Scanner sc = new Scanner(System.in);
    String wordsArr[];
    static char space = ' ';
    static int beginOfWord = 0, w = 0, reallength;
   private static String[] receiveWords(String str)
    {
        String[] wordsArr = new String[15];


        for (int i=0; i<str.length(); i++)
        {
            if (str.charAt(i) == space)
            {
                //out.append(str.substring(beginOfWord,i));
                wordsArr[w] = str.substring(beginOfWord,i);
                w++;
                beginOfWord = i+1;
            }
        }

        wordsArr[w] = str.substring(beginOfWord,str.length());
        reallength = w+1;

       return wordsArr;
    }
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Str> sortList = new ArrayList<Str>();

        //System.out.println("Введите список для сортировки: ");

        // Наполнение ArrayList'a объектами класса MyString
        String s = ""; String[] slova;
        Scanner in = new Scanner(new File("note.txt"));
        while(in.hasNext())
            s += in.nextLine() + " ";
        in.close();
      slova = receiveWords(s);
      for (int i = 0; i < slova.length; i++)
      {
          sortList.add(new Str(slova[i]));
      }

        Collections.sort(sortList);

        Iterator iter = sortList.iterator();
        System.out.println("\nОтсортированный список: ");

        while(iter.hasNext()) {
            System.out.println( ((Str) iter.next()).getStr());
        }

    }


}

