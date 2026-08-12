public class sumOfDigits {
    public static int sum(int n, int i) {
        if (n == 0) {
            return i;
        }
        return sum(n / 10, i + n % 10);
    }

    public static void main(String[] args) {
        int a = sum(111121, 0);
        System.out.println(a);
    }
}
