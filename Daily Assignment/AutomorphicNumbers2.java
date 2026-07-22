import java.util.Scanner;

public class AutomorphicNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int originalNum = num;
        int digits = 1;
        while (num > 0) {
            digits *= 10;
            num /= 10;
        }
        num = originalNum * originalNum;
        if (num % digits == originalNum) {
            System.out.println("Automorphic Numbers");
        } else {
            System.out.println("Not an Automorphic Numbers");
        }
    }
}
