public class Neon {
    public static boolean isNeon(int n, int pow, int sum) {
        if (pow == 0) {
            return n == sum;
        }
        return isNeon(n, pow / 10, sum + pow % 10);
    }

    public static void main(String[] args) {
        System.out.println(isNeon(9, 9 * 9, 0));
    }
}
