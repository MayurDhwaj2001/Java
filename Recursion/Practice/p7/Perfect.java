public class Perfect {
    public static boolean isPerfect(int m, int sum, int i) {
        if (i == m) {
            return m == sum;
        }
        if (m % i == 0) {
            sum += i;
        }
        return isPerfect(m, sum, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(28, 0, 1));
    }
}