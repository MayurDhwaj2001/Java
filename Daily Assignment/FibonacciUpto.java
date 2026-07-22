import java.util.Scanner;

public class FibonacciUpto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last number");
        int num = sc.nextInt();

        int a = 0, b = 1, c;
        while (a <= num) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        // System.out.println(a);
    }
}
