import java.util.Scanner;

public class HCFforTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        int larger, smaller;
        if (a > b) {
            larger = a;
            smaller = b;
        } else {
            larger = b;
            smaller = a;
        }
        int hcf = 1;
        for (int i = 1; i < larger; i++) {
            if (smaller % i == 0 && larger % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
