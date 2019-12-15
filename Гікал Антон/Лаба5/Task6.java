import java.util.Scanner;

public class Task6 {
    public static void main (String[] args){
        System.out.println("ВВедите строку");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] result = str.toCharArray();
        for(int  i = result.length -1 ;i >=0 ; i--){
            System.out.print(result[i]);
        }
    }
}
