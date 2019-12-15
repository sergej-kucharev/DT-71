import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        int a = (int)(Math.random()*100);
        System.out.println(a);
        System.out.println("Попробуйте угадать число от 0 до 100");
        int number;
        int i = 50;
        do {
            Scanner n = new Scanner(System.in);
            if(n.hasNextInt() )
                number = n.nextInt();
            else {
                System.out.println(" Невенрый ввод");
                return;
            }
            int max = a + (int)(i * Math.random());
            if (max> 100)
                max = 100;
            if (max < a)
                max = a;
            int min = a - (int)(i * Math.random());
            if ( min < 0 )
                min = 0;
            if (min > a)
                min = a;
            if (number > a)
                System.out.println(" Больше, попробуйте в диапазоне[" + min + ","  + max  + "]" );
            if (number < a)
                System.out.println(" Меньше, попробуйте в диапазоне[" + min + ","  + max  + "]" );
            i-=5;
            if (number == a)
                System.out.println("Верно");
        } while (number != a );
    }
}
