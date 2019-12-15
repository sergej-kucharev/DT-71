package lab_5;
import java.io.*;
import java.util.*;

public class task_2 {
	public static void main(String[] args) {
		ArrayList<Integer> alpha_list = new ArrayList<Integer>();
        for (int i = 0; i < 150; i++)
            alpha_list.add( (int)Math.round((Math.random() *199) + 1) );
        HashSet<Integer> alpha_set = new HashSet<>(alpha_list);
        ArrayList<Integer> list = new ArrayList<>(alpha_set);
        list.sort(Comparator.reverseOrder());
        ArrayList<Integer> beta_list = new ArrayList<>(list.subList(0,15));
        System.out.println(beta_list);
        try(FileWriter writer = new FileWriter("/Users/olya_kichangina/eclipse-workspace/lab_5/bin/lab_5/Results_task_2.txt")){
            writer.write(beta_list.toString());
            writer.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
	}
}
