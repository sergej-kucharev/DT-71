import java.util.*;
import java.io.*;
public class Program{ 

    public static void main (String args[]){
        Random random=new Random();
	ArrayList<Integer> alfa=new ArrayList<Integer>();
	int i;
	int j;
	for(i=0;i<150;i++) alfa.add(random.nextInt(201));
	ArrayList<Integer> indexes=new ArrayList<Integer>();
	ArrayList<Integer> beta=new ArrayList<Integer>();
	for(i=0;i<15;i++){
		int index_max=0;
		for(j=0;j<150;j++){
			if((alfa.get(j)>=alfa.get(index_max))&&(!indexes.contains(j))) index_max=j;
		}
		indexes.add(index_max);
		beta.add(alfa.get(index_max));
	}
	System.out.println(alfa);
	//System.out.println(indexes);
	System.out.println("////////////////////////////////////////////////////////////////////");
	System.out.println(beta);
    }
}

