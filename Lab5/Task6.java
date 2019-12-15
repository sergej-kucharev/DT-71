//Написати консольну програму, яка «розгортає задом наперед» рядок (наприклад, на вхід було «йцукенгшщзх»,
//на виході потрібно «хзщшгнекуцй»). Не застосовувати препарат функцію reverse

import java.util.*;

class Lab5{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("  Enter line: ");
        char[] reverse = in.nextLine().toCharArray();   /// а если ошибка
        String rev_string = "";

        for(int i=0; i<reverse.length/2; i++)
        {
            char x = reverse[i];
            reverse[i] = reverse[reverse.length-i-1];
            reverse[reverse.length-i-1]= x;
        }
        System.out.print("Reverse line: " + new String(reverse));

    }
}