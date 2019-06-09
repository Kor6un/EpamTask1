import java.util.Scanner;

public class Task1_3_2 {
    public static void main(String[] args) {
        int a, b, h;
        System.out.println("Введите отрезок [a, b]");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Введите шаг h");
        h = scanner.nextInt();
        scanner.close();

        for ( int i = a; i <= b; i = i + h) {
            if (i <= 2) {
                System.out.println(-i);
            } else {
                System.out.println(i);
            }
        }
    }
}
