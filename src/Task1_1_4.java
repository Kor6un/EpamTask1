import java.util.Scanner;

public class Task1_1_4 {
    public static void main(String[] args) {
        String r;
        StringBuilder result;

        System.out.println("Введите действительное число в виде nnn.ddd");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextLine();
        scanner.close();

        String[] res = r.split("\\.");

        result = new StringBuilder();
        result.append(res[1]).append(".").append(res[0]);

        System.out.println(result);
    }
}
