// 153
// 3=3^3 =27
// 5=5^3 =125
// 1=1^3 =1
// 153=153

import java.util.Scanner;

public class ArmstrongNumber {
    public static int pow(int lastDigit, int digits) {
        int sum = 1;
        for (int i = 1; i <= digits; i++) {
            sum = sum * lastDigit;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int original = num;
        int digits = 0;
        int res = 0;
        while (num > 0) {
            num /= 10;
            digits++;
        }
        num = original;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            res = res + pow(lastDigit, digits);
        }

        if (original == res) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }
    }
}
