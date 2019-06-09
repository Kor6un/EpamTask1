import java.util.Scanner;

public class Task1_2_4 {
    public static void main(String[] args) {
        double a, b, x, y, z;
        System.out.println("Введите размеры отверстия (A, B)");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.println("Введите размеры кирпича (x, y, z)");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        scanner.close();

        //TODO

        if ((a < x && a < y && a < z) || (b < x && b < y && b < z)) {
            System.out.println("НЕ пройдет");
        } else {
            if ((a >= x && b >= y) || (a >= x && b >= z) ||
                    (b >= x && a >= y) || (b >= x && b >= z)) {
                System.out.println("Пройдет");
            } else {
                System.out.println("NO");
            }
        }
    }
}
