
// equals the sum of its smaller positive factors, excluding the number itself
// example
//  (1 + 2 + 3 = 6)
// (1 + 2 + 4 + 7 + 14 = 28)
import java.util.Scanner;

public class perfectNumber {
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum == num;
    }

    public static void range(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        range(1, 100);

    }
}
