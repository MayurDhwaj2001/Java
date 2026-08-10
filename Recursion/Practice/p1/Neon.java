// Example: 9²=81 → 8+1=9.
public class Neon {
    public static boolean isNeon(int n, int m, int sum, int pow) {
        if (pow == 0) {
            return m == sum;
        }

        return isNeon(n / 10, m, sum + n % 10, pow / 10);
    }

    public static boolean isNeon(int n) {

        return isNeon(n, n, 0, (int) Math.pow(n, 2));
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(isNeon(n));
    }
}
