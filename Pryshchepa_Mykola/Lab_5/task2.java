import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.io.*;

public class task2 {


    public static void main(String[] args){
        ArrayList<Integer> alfa = new ArrayList<Integer>(150);
        ArrayList<Integer> beta = new ArrayList<Integer>(15);
        Random rand = new Random();
        int n = 150;//lenght of list
        for(int i = 0; i < n; i++){
            alfa.add(rand.nextInt(200));
        }
        ArrayList<Integer> gama = new ArrayList<Integer>(alfa);
        Collections.sort(gama);

        int count = 0;

        for(int i = n-1; ;i--){
           beta.add(gama.get(i));
           count++;
           if(count == 15)break;
        }

        for(int num : beta){
            System.out.print(num+"    ");
        }
        try(FileWriter writer = new FileWriter("result.txt", false)){

            for(int num : beta) {
                writer.write(num + "  ");
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }

}

