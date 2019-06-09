import java.util.Scanner;

public class Task1_3_8 {
    public static void main(String[] args) {
        int num1, num2, temp1, temp2, temp;
        System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        scanner.close();

        temp = num2;
        temp1 = num1;

        while (num1 != 0) {
            temp1 = num1 % 10;
            num1 = num1 / 10;
            num2 = temp;

            while (num2 / 10 != 0) {
                temp2 = num2 % 10;
                num2 = num2 / 10;

                if (temp1 == temp2) {
                    System.out.println(temp1);
                }
            }
        }
    }
}
