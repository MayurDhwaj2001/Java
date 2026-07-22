import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        int s = n * n;

        boolean flag = true;
        while (n > 0) {
            if ((n % 10) != (s % 10)) {
                flag = false;
                break;
            }
            n /= 10;
            s /= 10;
        }
        if (flag) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not an Automorphic number");

        }

    }
}
