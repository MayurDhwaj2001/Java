import java.util.Scanner;

public class LCMforTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        int original = a;

        int i = 1;
        while (i < b * a) {
            a = original * i;
            if (a % b == 0) {
                System.out.println("LCM: " + a);
                break;
            }
            i++;
        }
    }
}

//
//
//
//
