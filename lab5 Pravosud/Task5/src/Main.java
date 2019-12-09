import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        while (scanner.hasNext()) {
            strings.add(scanner.next());
        }
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.toLowerCase().compareTo(s2.toLowerCase());
            }
        });
        for (String c : strings) {
            System.out.println(c);
        }
        /*
        //file input/output realisation


        System.out.print("Enter the name of file:\n");
        String file_name;
        Scanner scanner, con_sc = new Scanner(System.in);
        file_name = con_sc.next();
        File input_file = new File(file_name + ".txt");

        ArrayList<String> strings = new ArrayList<>();
        try {
            scanner = new Scanner(input_file);
            while (scanner.hasNext()) {
                strings.add(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.print("File was not found.");
            return;
        }
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.toLowerCase().compareTo(s2.toLowerCase());
            }
        });
        try {
            Files.write(Paths.get(file_name + "_out.txt"),
                    String.join("\n", strings).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

         */
    }
}
