public class StrongNumber {
    public static boolean isStrong(int n, int m, int sum) {
        if (n == 0) {
            return m == sum;
        }
        return isStrong(n / 10, m, sum + fact(n % 10));
    }

    public static int fact(int i) {
        if (i <= 1) {
            return 1;
        }
        return i * fact(i - 1);
    }

    public static void main(String[] args) {
        System.out.println(isStrong(145, 145, 0));

    }
}
