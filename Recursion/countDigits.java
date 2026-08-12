public class countDigits {
    public static int count(int n, int i) {
        if (n == 0) {
            return i;
        }
        return count(n / 10, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(count(32211, 0));
    }
}
