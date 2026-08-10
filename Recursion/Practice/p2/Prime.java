public class Prime {
    public static boolean isPrime(int n, int m) {
        if (m == n) {
            return true;
        }
        if (n % m == 0) {
            return false;
        }
        return isPrime(n, m + 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(29, 2));
    }
}
