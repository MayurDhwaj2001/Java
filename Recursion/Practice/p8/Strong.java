public class Strong {
    public static int fact(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            count *= i;
        }
        return count;
    }

    public static boolean isStrong(int n, int m, int sum) {
        if (n == 0) {
            return m == sum;
        }
        return isStrong(n / 10, m, sum + fact(n % 10));
    }

    public static void main(String[] args) {
        System.out.println(isStrong(145, 145, 0));
    }
}
