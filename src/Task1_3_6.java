import java.util.Scanner;

public class Task1_3_6 {
    public static void main(String[] args) {
        /*char[] c;
        System.out.println("Введите любой символ ");
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextLine().toCharArray();
        System.out.println((int)c[0]);*/

        for (int i = 0; i <= 127; i++) {
            System.out.println((char)i + " = " + i);
        }

    }
}
