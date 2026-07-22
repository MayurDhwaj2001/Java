import java.util.Scanner;

public class DecimalToBinary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int res = 0;
        int i = 1;

        while (num > 0) {
            int bit = num % 2;
            res = bit * i + res;
            num /= 2;
            i *= 10;
        }

        System.out.println(res);
    }
}
