import java.util.Scanner;

public class Task1_1_1 {
    public static void main(String[] args) {
        double a, b, c, z;
        System.out.println("Введите а, b и c");
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        scanner.close();

        z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }
}
