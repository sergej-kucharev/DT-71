import java.util.Scanner;
public class Program{ 
      
    public static void main (String args[]){
	Scanner in=new Scanner(System.in);
	String temp=in.nextLine();
	int l=temp.length();
	char[] ch_array=temp.toCharArray();
	int i;
	for(i=l-1;i>=0;i--){
		System.out.print(ch_array[i]);
	}
	System.out.print('\n');
    }
}
