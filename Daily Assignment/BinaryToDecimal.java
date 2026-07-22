import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Binary numbr");
        int num = sc.nextInt();
        int decimal = 0;
        for (int pow = 1; num > 0; pow++) {
            int lastDigit = num % 10;
            num /= 10;
            int sq = lastDigit;
            for (int j = 1; j < pow; j++) {
                sq = sq * 2;
            }
            decimal = decimal + sq;
        }
        System.out.println(decimal);
    }
}
