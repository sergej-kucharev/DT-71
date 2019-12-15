package lab_5;
import java.util.Scanner;

public class task_6 {
	public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String reverse_string = new String();
        for (int i =  string.length() -1 ;i >= 0; i--) {
            reverse_string += string.charAt(i);
    }
        System.out.println("Reversed string: ");
        System.out.print(reverse_string);
}
}
