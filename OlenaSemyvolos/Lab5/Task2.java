//Дана колекція Альфа типу List на 150 елементів, заповніть її рандомно цілими числами від 1 до 200.
//Сформуйте колекцію Бета з 15 елементів, які є найбільшими в Альфа. Альфу змінювати не можна.
//Бету виведіть в консоль і файл

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

class Lab5{
    public static void main(String[] args) throws Exception{

        ArrayList<Integer> alpha = new ArrayList<Integer>();
        for (int i = 0; i < 150; i++) alpha.add((int)(Math.random()*200+1));
        System.out.println("Alpha list (" + alpha.size() +"):");
        System.out.println(alpha);

        //для проверки результата:
        //alpha.sort((a,b)-> { return b-a;});
        //System.out.println(alpha);

        ArrayList<Integer> beta = new ArrayList<Integer>();
        int max = 200;
        do{
            if(alpha.contains(max)) beta.add(max);
            max--;
        }while(beta.size() < 15);

        System.out.println("\nBeta list (" + beta.size() +"):");
        System.out.println(beta);

        FileWriter writer = new FileWriter("beta.txt", false);
        writer.write(beta.toString());
        writer.close();
    }
}