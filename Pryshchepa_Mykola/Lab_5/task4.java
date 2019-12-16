import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args){
        int comp_number, people_number;
        boolean a = false;
        Scanner str = new Scanner(System.in);


        System.out.print("Компютер загадує число: ");
        Random rand = new Random();
        comp_number = rand.nextInt(101);
        System.out.print(comp_number);


        int max = 100, min = 0;

        while (true) {
            System.out.print("Вгадайте число в діапазоні"+'['+min+','+max+']');
            try {
                people_number = str.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Ви ввели не число!");
                return;
            }
            if(people_number<min || people_number> max){
                System.out.println("Число не входить в діапазон " + '['+min+','+max+']');
                continue;
            }
            if(people_number>comp_number){
                System.out.print("Загадане число менше, ніж ви ввели");
                max = people_number;
            }
            else if(people_number<comp_number){
                System.out.print("Загадане число більше, ніж ви ввели");
                min = people_number;
            }
            else{
                System.out.print("Вітаю, ми вгадали загадане число:"+comp_number);
                break;
            }
        }



    }

}
