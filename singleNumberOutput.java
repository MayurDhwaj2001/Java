import java.util.Scanner;

public class singleNumberOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num /= 10;
            if (num == 0 && sum > 9) {
                System.out.println(sum);
                num = sum;
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}
