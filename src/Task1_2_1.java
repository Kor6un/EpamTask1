import java.util.Scanner;

public class Task1_2_1 {
    public static void main(String[] args) {
        double a, b;
        System.out.println("Введите два ула (в градусах)");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        scanner.close();

        if (((a > 0 || a < 178) || (b > 0 || b <178)) && ((180 - a - b) >= 0)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник НЕ существует");
        }

        if ((180 - a - b) == 90) {
            System.out.println("Треугольник прямоугольный");
        }
    }
}
