import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TASK4 
{	public static boolean limits(int num, int m , int M) 
	{
	boolean r=false;
	if(num<=M&num>=m) r=true;
	else {System.out.println("You have chosen number over the limits, try again!");}
	return r;
	}
	public static void main(String args[])
	{
		System.out.println("Hello! Let's play!");
		Random r=new Random();
		int NUM=r.nextInt(101);
		int PlayerNum=-1;
		System.out.print("Guess the number:\n");
		Scanner in = new Scanner(System.in);
		int min=0;int max=100;
		
		
		while(PlayerNum!=NUM) 
		{	
			try {
		int y=in.nextInt();
		if(limits(y,min, max)==false) 
		{
			
		}
		else
		{PlayerNum=y;
			if(PlayerNum!=NUM) 
			{
				if(NUM>PlayerNum) min=PlayerNum+1;
				if(NUM<PlayerNum) max=PlayerNum-1;
				System.out.print("Try again in new limits ["+min+","+max+"]\n");
				
			}
		}}catch(InputMismatchException u) {System.out.print("Error "+u);	break;	}
		}
		
		if(NUM==PlayerNum) {
		System.out.print("Congratulations! You win! The number was "+NUM);}
		in.close();
		System.out.print("\nGame is finished");
	}
	
	
	
}
