import java.util.Scanner;

public class Task1_3_5 {
    public static void main(String[] args) {
        double e;
        System.out.println("Введите число е");
        Scanner scanner = new Scanner(System.in);
        e = scanner.nextDouble();

        double a = 0;
        double sum = 0;
        int i = 1;
        do {
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            i++;
            sum += a;
        } while (a >= e);
        System.out.println(sum);
    }
}
