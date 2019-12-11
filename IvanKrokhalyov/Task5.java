import java.util.*;
import java.io.*;
import java.nio.file.*;
public class Program{ 
    public static void main (String args[]) throws FileNotFoundException{
	File f=new File("/home/ivan/Desktop/testing/input5.txt");
        Scanner in=new Scanner(f);
        ArrayList<String> words=new ArrayList<String>();
        while(in.hasNext()){
		String temp=in.next();
		words.add(temp);
	}
	//Мне просто со знаками препинания кажется все веселее выглядит
	for(String s:words) System.out.print(s+" ");
	System.out.printf("\n/////////////////////////////////////////////\n");
	int i=0;
	int j=0;
	int size=words.size();
	for (i=0;i<size-1;i++){
		for(j=0;j<size-1;j++){
			if(words.get(j).compareToIgnoreCase(words.get(j+1))>=0){
				String temp=words.get(j);
				words.set(j,words.get(j+1));
				words.set(j+1,temp);
			}
		}
	}
	for(String s:words){
		System.out.print(s+" ");
	}
	System.out.print("\n");
    }
}

