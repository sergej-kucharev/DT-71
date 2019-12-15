package lab_5;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;
import java.io.*;

public class task_5{
	
	public static void language(String s, BufferedReader in) throws IOException {
        try {
		List<String> arr = new ArrayList<>();
        String line;
        while ((line = in.readLine()) != null) {
        	for (String word : line.split("\\s")) {
                arr.add(word);
            }
        }
        in.close();
        arr.sort(String::compareToIgnoreCase);
        System.out.println(arr);
        } 
        catch (IOException e) 
        {
        	System.out.print("Error: "+e);

        }
	}
	
	public static void main(String[] args) throws IOException {
		  String e = "English";
		  String r = "Russian";
		  String u = "Ukrainian";
		  System.out.println(e + " language:");
		  BufferedReader in_e = new BufferedReader(new FileReader("task_5_english.txt"));
		  language(e, in_e);
		  System.out.println();
		  System.out.println(r + " language:");
		  BufferedReader in_r = new BufferedReader(new FileReader("task_5_russian.txt"));
		  language(r, in_r);
		  System.out.println();
		  System.out.println(u + " language:");
		  BufferedReader in_u = new BufferedReader(new FileReader("task_5_ukrainian.txt"));
		  language(u, in_u);
}
}
