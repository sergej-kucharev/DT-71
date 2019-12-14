package task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Task5 {
    public static void task5() {
        System.out.println("TASK5");
        String curDir = System.getProperty("user.dir");
        String fileNameEng = curDir + "/src/task5/files/task5Input.txt";
        String fileNameUkr = curDir + "/src/task5/files/task5InputUkr.txt";
        String fileName = fileNameEng;
        int language = analyseAnswer();
        if(language == 2)
            fileName = fileNameUkr;

        String info = readFromFile(fileName);
        System.out.println("Text in the file: ");
        System.out.println(info);
        String[] words = info.split("[ ,.;:=?!\n\t!/+{}|//]+");
        ArrayList<String> list= new ArrayList<>();
        for(int i = 0; i < words.length; i++)
        {
            words[i].trim();
            if(!words[i].equals(""))
                list.add(words[i]);
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        });
        System.out.println("Sorted list of words: ");
        System.out.println(list);
        System.out.println("End of TASK5");

    }
    public static String readFromFile(String fileName)
    {
        try {
            Scanner scan = new Scanner(new File(fileName));
            return scan.useDelimiter("\\A").next();
        } catch (FileNotFoundException ex) {
            System.out.println("No such file.");
        }
        return null;
    }
    public static int analyseAnswer(){
        System.out.println("Enter 1 to work with English text, or 2 to work with Ukrainian.\n(if wrong value it is 1 by default)\n" +
                "To change the files you could change text in corresponding files " +
                "or change the path in code:)");
        Scanner scan = new Scanner(System.in);
        int result = 0;
        try {
            result = Integer.parseInt(scan.nextLine());
        } catch (Exception ex){
        }
        return result;
    }
}
