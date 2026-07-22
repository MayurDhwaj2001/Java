
//  30= 11110
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        String res = "";
        while (num > 0) {
            int bit = num % 2;
            res = bit + res;
            num /= 2;
        }

        System.out.println(res);
    }
}
