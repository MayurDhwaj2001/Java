// ex.(Input) 1234 = 1+2+3+4  
// 	10 = 1+0
// 	1 (Output)

import java.util.Scanner;

public class repeatedDigitSum {
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
