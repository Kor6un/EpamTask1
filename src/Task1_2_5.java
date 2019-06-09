import java.util.Scanner;

public class Task1_2_5 {
    public static void main(String[] args) {
        double x;
        System.out.println("Введите значение х");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        scanner.close();

        if (x <= 3) {
            System.out.println(Math.pow(x,2) - 3 * x + 9);
        }

        if (x > 3) {
            System.out.println(1/(Math.pow(x,3) + 6));
        }
    }
}
