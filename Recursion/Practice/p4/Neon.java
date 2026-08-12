public class Neon {
    public static boolean isNeon(int n, int sq, int sum) {
        if (sq == 0) {
            return n == sum;
        }
        return isNeon(n, sq / 10, sum + sq % 10);
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(isNeon(n, n * n, 0));
    }
}
