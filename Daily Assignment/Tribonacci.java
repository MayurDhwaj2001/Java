import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of digits");
        int num = sc.nextInt();

        int a = 0, b = 1, c = 1, d;
        while (num > 0) {
            System.out.println(a);
            d = a + b + c;
            a = b;
            b = c;
            c = d;
            num--;
        }
    }
}
