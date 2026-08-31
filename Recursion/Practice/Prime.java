public class Prime {
    public static boolean isPrime(int num, int i) {
        if (i == num) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        return isPrime(num, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(28, 2));
    }
}
