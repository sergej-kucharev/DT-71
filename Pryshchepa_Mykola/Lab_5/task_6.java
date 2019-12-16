import java.util.Scanner;
import java.util.ArrayList;

public class task_6 {
    public static void main(String[] args){
        String lst, lst_1;
        Scanner str = new Scanner(System.in);
        System.out.print("Enter string: ");
        lst = str.nextLine();
        System.out.println("Before: "+lst);
        System.out.print("After: ");
        for(int i=0; i < lst.length(); i++){
            System.out.print(lst.charAt(lst.length()-i-1));
        }


    }
}
