public class Palindrome {
    public static boolean isPalindrome(int n, int m, int rev) {
        if (n == 0) {
            return m == rev;
        }
        return isPalindrome(n / 10, m, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121, 121, 0));
    }
}
