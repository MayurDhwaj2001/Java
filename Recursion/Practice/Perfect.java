public class Perfect {
    public static boolean isPerfect(int n, int m, int i, int sum) {
        if (i == sum) {
            return m == sum;
        }
        if (n % i == 0) {
            sum += i;
        }
        return isPerfect(n, m, i, sum + 1);

    }

    public static void main(String[] args) {
        System.out.println(isPerfect(28, 28, 1, 0));
    }
}
