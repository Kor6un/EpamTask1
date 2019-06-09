import java.util.Scanner;

public class Task1_3_7 {
    public static void main(String[] args) {
        int m, n;
        System.out.println("Введите границы промежутка (m, n)");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.close();

        for (int i = n; i <= m; i++) {
            for (int j = 2; j <= 9; j++) {
                if (i%j == 0) {
                    System.out.println(j);
                }
            }
        }
    }
}
