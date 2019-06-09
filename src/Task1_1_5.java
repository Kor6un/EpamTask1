import java.util.Scanner;

public class Task1_1_5 {
    public static void main(String[] args) {
        int t, hour, min, sec;
        System.out.println("Введите количество секунд");
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        scanner.close();

        hour = t/3600;
        min =(t-hour*3600)/60;
        sec = t - (hour*3600 + min*60);

        System.out.println(hour + "ч " + min + "мин " + sec + "с");
    }
}
