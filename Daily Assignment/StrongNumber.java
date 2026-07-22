// 145
// 5! =120
// 4!=24
// 1!=1
// 145
// 145=145 so its a strong number 

import java.util.Scanner;

public class StrongNumber {

    static int fact(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int original = sc.nextInt();
        int num = original;
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            sum = sum + fact(lastDigit);
        }
        if (original == sum) {
            System.out.println(original + " is a strong number");
        }
    }
}
