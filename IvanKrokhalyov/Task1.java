import java.util.*;
import java.io.*;
public class Program{ 
    public static int step(int a,int n){
	int S=1;
	int i;
	for(i=1;i<=n;i++) S=S*a;
	return S;
	}
    public static void main (String args[]) throws IOException{
	File output_add=new File("output1_add.txt");
	File output_remove=new File("output1_remove.txt");
	File output_find=new File("output1_find.txt");
	FileWriter fw_add=new FileWriter(output_add);
	FileWriter fw_remove=new FileWriter(output_remove);
	FileWriter fw_find=new FileWriter(output_find);
	fw_add.write(" Count \t AL \t LL \t TS \t HS \n");
	fw_remove.write(" Count \t AL \t LL \t TS \t HS \n");
	fw_find.write(" Count \t AL \t LL \t TS \t HS \n");
        int i;
	int j;
	Random random=new Random();
	for (i=0;i<=10;i++){
		ArrayList<Integer> array=new ArrayList<Integer>();
		LinkedList<Integer> list=new LinkedList<Integer>();
		TreeSet<Integer> tree_set=new TreeSet<Integer>();
		HashSet<Integer> hash_set=new HashSet<Integer>();
		for(j=0;j<step(2,i);j++){
			int temp=random.nextInt(200);
			array.add(temp);
			list.add(temp);
			tree_set.add(temp);
			hash_set.add(temp);
		}
		fw_add.write(step(2,i)+"\t");
		int temp2=random.nextInt(200);
		long time1;
		long time2;
		//add
		time1=System.nanoTime();
		array.add(temp2);
		time2=System.nanoTime();
		fw_add.write((time2-time1)+"\t");
		//
		time1=System.nanoTime();
                list.add(temp2);
                time2=System.nanoTime();
                fw_add.write((time2-time1)+"\t");
                //
		time1=System.nanoTime();
                tree_set.add(temp2);
                time2=System.nanoTime();
                fw_add.write((time2-time1)+"\t");
                //
		time1=System.nanoTime();
                hash_set.add(temp2);
                time2=System.nanoTime();
                fw_add.write((time2-time1)+"\t");
                //
		fw_add.write("\n");
		//remove
		fw_remove.write(step(2,i)+"\t");
		time1=System.nanoTime();
                array.remove(step(2,i-1));
                time2=System.nanoTime();
                fw_remove.write((time2-time1)+"\t");
		//
		time1=System.nanoTime();
                list.remove(step(2,i-1));
                time2=System.nanoTime();
                fw_remove.write((time2-time1)+"\t");
		//
		time1=System.nanoTime();
                tree_set.remove(temp2);
                time2=System.nanoTime();
                fw_remove.write((time2-time1)+"\t");
		//
		time1=System.nanoTime();
                hash_set.remove(temp2);
                time2=System.nanoTime();
                fw_remove.write((time2-time1)+"\t");
		fw_remove.write("\n");
		//find
		fw_find.write(step(2,i)+"\t");
		temp2=array.get(random.nextInt(step(2,i)));
		time1=System.nanoTime();
                array.contains(temp2);
                time2=System.nanoTime();
                fw_find.write((time2-time1)+"\t");
		//
		time1=System.nanoTime();
                list.contains(temp2);
                time2=System.nanoTime();
                fw_find.write((time2-time1)+"\t");
		//
		time1=System.nanoTime();
                tree_set.contains(temp2);
                time2=System.nanoTime();
                fw_find.write((time2-time1)+"\t");
		//
		time1=System.nanoTime();
                hash_set.contains(temp2);
                time2=System.nanoTime();
                fw_find.write((time2-time1)+"\t");
		fw_find.write("\n");
		
	}
	fw_add.close();
	fw_remove.close();
	fw_find.close();
    }
}


