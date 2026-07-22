import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int temp = 0;

        if (num == 1) {
            System.out.println("Nither prime nor composite");
        } else if (num <= 0) {
            System.out.println("Invalid input");
        } else {

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    temp++;
                    break;
                }
            }
            if (temp == 1) {
                System.out.println(num + " is not a prime number");
            } else {
                System.out.println(num + " is a prime number");
            }
        }

    }

}
