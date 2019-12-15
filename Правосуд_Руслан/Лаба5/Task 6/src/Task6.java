import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = str.length();
        char[] arr = str.toCharArray();

        char temp;
        for (int i = 0; i <= (arr.length - 1) / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }
        str = new String(arr);
        System.out.printf(str);
    }
}
