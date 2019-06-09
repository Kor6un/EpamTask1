import java.util.Scanner;

public class Task1_1_6 {
    public static void main(String[] args) {
        double x, y;
        System.out.println("Введите кооридинаты точки");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        scanner.close();

        if (((y < 4 && y >= 0) && (x > -2 && x <= 2)) ||
                ((y < 0 && y <= -2) && (x >= -4 && x <= 4)) ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
