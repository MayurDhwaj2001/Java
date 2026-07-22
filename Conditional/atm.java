import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        int amount = sc.nextInt();
        int twothousand = 0;
        int fivehundred = 0;
        int twohundred = 0;
        int hundred = 0;

        if (amount >= 2000) {
            twothousand = amount / 2000;
            amount = amount % 2000;
            System.out.println("2000 X " + twothousand);
        }
        if (amount >= 500) {
            fivehundred = amount / 500;
            amount = amount % 500;
            System.out.println("500 X " + fivehundred);
        }
        if (amount >= 200) {
            twohundred = amount / 200;
            amount = amount % 200;
            System.out.println("200 X " + twohundred);
        }
        if (amount >= 100) {
            hundred = amount / 100;
            amount = amount % 100;
            System.out.println("100 X " + hundred);
        }
    }
}
