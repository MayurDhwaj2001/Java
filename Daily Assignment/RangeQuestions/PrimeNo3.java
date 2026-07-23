
// Print alternate Prime numbers in a given range 
import java.util.Scanner;

public class PrimeNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range separated by space");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int k = 1;
        for (int i = start; i <= end; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && i > 1) {
                if (k % 2 == 1) {
                    System.out.print(i + " ");
                }
                k++;
            }
        }
    }
}
