import java.util.Scanner;

public class Task1_3_3 {
    public static void main(String[] args) {
        double result;
        result = 0;
        for (int i = 1; i <= 100; i++) {
            result = result + Math.pow(i, 2);
        }
        System.out.println(result);
    }
}
