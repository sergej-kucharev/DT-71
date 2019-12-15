
import java.util.Scanner;

public class task4 {

    public static boolean check(String s){
        char[] str = s.toCharArray();
        for( int i = 0; i < s.length(); i++ )
            if( ( (str[i] > '9') || ( str[i] <'0') )  )
                return false;
        return true;
    }


    public static void main(String[] args) {
        System.out.println("You will play in really cool Game,\n where you should guess integer number from 0 to 100\n" +
                "Good luck!)\nPlease, enter number");
        int a = 0, b= 100, left = 0, right = 100;
        Scanner in = new Scanner(System.in);

        int input = 0, target = (int)(Math.random()*100);
        System.out.println(target);
        do{

            String s = in.nextLine();
            if( check(s))
                input = Integer.parseInt(s);
            else {
                System.out.println("Wrong data, try again");
                continue;
            }
            if( input != target ){
                System.out.print("Try again");
                if( input < target) {
                    if (2 * target - input > 0)
                        b = 100;
                    else
                        b = 2 * input - target;
                    a = input +1;
                    if( (target-left) > (target-a) )
                        left = a;
                    if( (right - target) > (b - target))
                        right = b;
                    System.out.println("Number between [" + left + "," + right + "]");
                }
                else{
                    b = input - 1;
                    if( -input + 2*target < 0)
                        a = 0;
                    else
                        a = -input + 2*target;
                    if( (target-left) > (target-a) )
                        left = a;
                    if( (right - target) > (b - target))
                        right = b;
                    System.out.println("Number between [" + left+ "," + right+ "]");
                }
            }

        }while (input != target );
        System.out.println("Congratulations!!!");
    }
}
