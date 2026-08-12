public class Strong {
    public static boolean isArmstrong(int n, int m, int sum) {
        if (n == 0) {
            return m == sum;
        }
        return isArmstrong(n / 10, m, sum + fact(n % 10));
    }

    public static int fact(int n) {
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(145, 145, 0));
    }
}