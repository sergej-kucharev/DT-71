
import java.util.Scanner;

public class TASK6 
{
	public static void main(String args[]) 
	{
		System.out.print("Hello! Write something:\n");
		Scanner in = new Scanner(System.in);
		
		String info=in.next();
		StringBuffer newinfo=new StringBuffer();
		for( int i=0; i<info.length(); i++) 
		{
			newinfo.insert(i, info.charAt(info.length()-i-1));
		}
		System.out.print(newinfo);
		in.close();
	}

}
