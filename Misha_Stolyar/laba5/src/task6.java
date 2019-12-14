import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter something");
        String s = in.nextLine();
        char[] str = s.toCharArray();
        int n = s.length();
        for( int i = 0; i <n/2; i++){
            char temp = str[i];
            str[i] = str[n-1-i];
            str[n-1-i] = temp;
        }
        System.out.print("Reverse: ");
        for( int i = 0; i < n; i++ )
            System.out.print(str[i]);
    }
}