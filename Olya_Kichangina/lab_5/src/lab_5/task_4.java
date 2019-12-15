package lab_5;
import java.util.Scanner;

public class task_4 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		boolean guess = false;
		int right_border = 100;
		int left_border = 0;
		int user_number;
		int real_number = (int)Math.round((Math.random()*99) + 1);
		System.out.println("Hello, my dear user! Guessing game welcomes you!Try to guess a number;)))");
		System.out.println("Enter estimated number");
		while(!guess) {
				try {
	                user_number = Integer.parseInt(in.nextLine());
	            }
	            catch (NumberFormatException err){
	                System.out.println("Enter INTEGER number!");
	                System.out.println("Enter estimated number");
	                continue;
	            }
				if (user_number==real_number) {guess =false; System.out.println("Congratulations! You won!:)");}
				else {
					if(user_number > right_border && user_number < left_border) {System.out.println("Number is over borders!");System.out.println("Enter estimated number");}
				
				else {
					if(user_number <= right_border && user_number > real_number) right_border = user_number;
			    else if(user_number >= left_border && user_number < real_number) left_border = user_number;
				}
					System.out.println("Try in interval [" + left_border + "; " + right_border + "].");
					System.out.println("Enter estimated number");
	}
  }
 }	
}
