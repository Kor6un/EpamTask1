import java.util.Scanner;

public class Task1_1_2 {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Введите а, b и c");
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        scanner.close();

        System.out.println( (b + Math.sqrt(Math.pow(b, 2)) + 4 * a * c)/(2 * a) -
                Math.pow(a, 3) + Math.pow(b, -2));
    }
}
