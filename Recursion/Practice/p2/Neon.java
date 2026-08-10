// 9²=81 → 8+1=9
public class Neon {
    public static boolean isNeon(int n, int m, int sum, int pow) {
        if (pow == 0) {
            return m == sum;
        }
        return isNeon(n, m, sum + pow % 10, pow / 10);
    }

    public static boolean isNeon(int n) {
        return isNeon(n, n, 0, n * n);
    }

    public static void main(String[] args) {
        System.out.println(isNeon(9));
    }
}
