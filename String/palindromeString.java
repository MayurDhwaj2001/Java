public class palindromeString {
    public static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "malayalam";
        System.out.println(isPalindrome(s));
    }
}
