
// 9
// 9^2 = 81
// 8+1=9
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int original = num;
        num = num * num;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num /= 10;
        }
        if (sum == original) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }
}
