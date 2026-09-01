public class AlternatePrimePalindrome {
    public static boolean isPrime(int n, int i) {
        if (n <= 1)
            return false;
        if (i == n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i + 1);
    }

    public static boolean isPalindrome(int i, int j, int rev) {
        if (i == 0) {
            return j == rev;
        }
        return isPalindrome(i / 10, j, rev * 10 + (i % 10));
    }

    public static void main(String[] args) {
        int count = 1;

        for (int i = 1; i <= 500; i++) {
            if (isPrime(i, 2) && isPalindrome(i, i, 0)) {
                count++;
                if (count % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}