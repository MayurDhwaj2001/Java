import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of digits");
        int num = sc.nextInt();

        int a = 0, b = 1, c;
        while (num > 0) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            num--;
        }
    }
}
