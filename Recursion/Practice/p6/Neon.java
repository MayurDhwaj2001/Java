public class Neon {
    public static boolean isNeon(int n, int sq, int sum) {
        if (sq == 0) {
            return n == sum;
        }
        return isNeon(n, sq / 10, sum + sq % 10);
    }

    public static void main(String[] args) {
        System.out.println(isNeon(9, 9 * 9, 0));
    }
}
