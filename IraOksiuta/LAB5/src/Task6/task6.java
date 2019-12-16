package Task6;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
public class task6 {
    public static void main() {
        ArrayList<String> text = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter text, press ctrl + D to finish: \n");
        while (sc.hasNext())
            text.add(sc.next());
        for (int i=0;i<text.size();i++){
            char[] word=text.get(i).toCharArray();
            char[] wordcopy=text.get(i).toCharArray();
            for(int j=0;j<word.length;j++){
                word[j]=wordcopy[word.length-j-1];
            }
            String string=new String(word);
            text.set(i,string);
        }
        for (int i=0;i<text.size();i++){
            System.out.print(text.get(i)+" ");
        }
    }
}
