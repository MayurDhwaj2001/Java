public class Strong {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static boolean isStrong(int n, int m, int sum) {
        if (m == sum) {
            return m == sum;
        }
        return isStrong(n / 10, m, sum + fact(n % 10));
    }

    public static void main(String[] args) {
        System.out.println(isStrong(145, 145, 0));
    }
}
