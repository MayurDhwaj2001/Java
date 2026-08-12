public class Perfect {
    public static boolean isPerfect(int n, int m, int sum, int i) {
        if (i == m) {
            return m == sum;
        }
        if (m % i == 0) {
            sum += i;
        }
        return isPerfect(n, m, sum, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(28, 28, 0, 1));
    }
}
