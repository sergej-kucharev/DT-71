package Task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nType here your line:");

        String word = input.nextLine();
        String[] letters = word.split("");
        String r_word = "";

        for (int i = letters.length-1; i>=0; i--)
            r_word += letters[i];

        System.out.println("\nHere is your reversed line:");
        System.out.println(r_word);
    }

}
