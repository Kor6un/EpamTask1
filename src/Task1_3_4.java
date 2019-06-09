public class Task1_3_4 {
    public static void main(String[] args) {
        double  result;
        result = 1;
        for (int i = 1; i <= 200; i++) {
            result = result * (long)Math.pow(i, 2);
        }
        System.out.println((long)result);
    }
}
