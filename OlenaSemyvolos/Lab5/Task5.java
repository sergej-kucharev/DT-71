//Написати консольну програму, яка б сортувала текст поданий їй з файлу на стандартний вхід за алфавітом.
//Програма повинна ігнорувати регістр при сортуванні. Перевірити роботу для англійської, української та російської мов

import java.util.*;
import java.io.*;
import java.lang.*;

class Lab5{
    public static void main(String[] args) {
        sort("eng");
        sort("rus");
        sort("ukr");
    }

    public static void sort(String lang){

        ArrayList<Character> line = new ArrayList<Character>();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        ArrayList<Character> result = new ArrayList<Character>();

        try(FileReader reader = new FileReader(lang + ".txt");)
        {
            int ch;
            while((ch=reader.read())!=-1){
                line.add((char)ch);
            }
        }
        catch (IOException ex){ System.out.println("File with the " + lang + " text haven`t been found, so there is nothing to sort."); }

        try(FileReader reader = new FileReader(lang + "alph.txt");)
        {
            int letter;
            while((letter=reader.read())!=-1){
                alphabet.add((char)letter);
            }
        }
        catch (IOException ex){ System.out.println("File with the " + lang + " alphabet haven`t been found, so sorting won`t be complited."); }

        for (int i=0; i<line.size(); i++) System.out.print(line.get(i));
        System.out.println();

        for (int i=0; i<alphabet.size(); i++)
        {
            for (int j=0; j<line.size(); j++)
            {
                if (Character.toLowerCase(line.get(j)) == alphabet.get(i)) result.add(line.get(j));
            }
        }

        for (int i=0; i<result.size(); i++) System.out.print(result.get(i));
        System.out.println();
        System.out.println();
    }
}
