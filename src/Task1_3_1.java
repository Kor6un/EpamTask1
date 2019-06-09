import java.util.Scanner;

public class Task1_3_1 {
    public static void main(String[] args) {
        int x, result;
        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        scanner.close();

        result = 0;
        for (int i = 1; i <= x; i++) {
            result = result + i;
        }
        System.out.println(result);
    }
}
