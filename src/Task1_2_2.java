import java.util.Scanner;

public class Task1_2_2 {
    public static void main(String[] args) {
        double a, b, c, d, min1, min2;
        System.out.println("Введите четыре числа");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        scanner.close();

        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }

        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }

        if (min1 < min2) {
            System.out.println(min2);
        } else {
            System.out.println(min1);
        }
    }
}
