import java.util.Scanner;

public class Task1_1_3 {
    public static void main(String[] args) {
        double x, y;

        System.out.println("Введите x и y");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        scanner.close();

        System.out.println( ((Math.sin(x) + Math.cos(y))/
                (Math.cos(x) - Math.sin(y))) * Math.tan(x * y) );
    }
}
