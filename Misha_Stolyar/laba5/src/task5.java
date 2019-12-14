import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class task5 {

    public static void sort( String[] Res, int n){
        String temp, s1, s2;
        for( int i = 0; i < n; i++){
            for( int j = 0; j < n; j++) {
                s1 = Res[i].toLowerCase();
                s2 = Res[j].toLowerCase();
                if (s1.compareTo(s2) < 0) {
                    temp = Res[i];
                    Res[i] = Res[j];
                    Res[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("input5.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        String Text = sb.toString();

        String[] Res = Text.split("[\\p{Punct}\\s]+");
        sort(Res, Res.length);
        for (String s : Res)
            System.out.println(s);
    }
}