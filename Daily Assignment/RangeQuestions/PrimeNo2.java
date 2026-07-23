
// Print first n Prime number 
import java.util.Scanner;

public class PrimeNo2 {

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime number to print starting from 2");
        int num = sc.nextInt();

        int i = 1;
        int number = 2;
        while (i <= num) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                i++;
            }
            number++;
        }
    }
}