public class stringPalindromeCheck {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";

        for (int i = 0; i < s.length(); i++) {
            rev += s.charAt(i);

        }

        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome ");
        }
    }
}
