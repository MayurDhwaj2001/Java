
public class Prime {
    public static boolean isPrime(int n, int i) {
        if (i == n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {

        System.out.println(isPrime(29, 2));
    }

}