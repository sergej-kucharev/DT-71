import java.util.Scanner;
public class Example {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] reverseArray1 = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        System.out.print("Строка в обратном порядке: ");
        for (int i = reverseArray1.length - 1; i >= 0; i--) System.out.print(reverseArray1[i]);
    }
}

