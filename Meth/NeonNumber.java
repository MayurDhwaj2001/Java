import java.util.Scanner;

public class NeonNumber {
    public static boolean isNeon(int num) {
        int original = num;
        num = num * num;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num /= 10;
        }
        return sum == original;
    }

    public static void range(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isNeon(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        range(0, 10);

    }
}
