package Task5;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static List<String> read_from_file(String fname) throws IOException
    {
        File txtFile = new File(fname + ".txt");

        if (txtFile.isFile())
        {
            String content = new Scanner(new File(fname + ".txt"), "UTF-8").useDelimiter("\\Z").next();

            List<String> words = new ArrayList<String>(Arrays.asList(content.split("\\s+")));

            words.sort(new Comparator<String>() {
                @Override
                public int compare(String t, String t1) {
                    return t.toLowerCase().compareTo(t1.toLowerCase());
                }
            });

            for (String w: words)
                System.out.println(w);

            return words;
        }
        else
        {
            System.out.println("No such txt file!");
            return null;
        }

    }

    public static void main(String[] args) throws IOException {
        read_from_file("input_for_Task5");
    }
}
