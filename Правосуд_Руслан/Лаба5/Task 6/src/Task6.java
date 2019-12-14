import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = str.length();
        char[] arr = str.toCharArray();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
