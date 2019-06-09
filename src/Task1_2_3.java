import java.util.Scanner;

public class Task1_2_3 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;
        System.out.println("Введите координаты трех точек");
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        scanner.close();

        if ((x3-x1)/(x2-x1) == (y3-y1)/(y2-y1)) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки НЕ лежат на одной прямой");
        }
    }
}
