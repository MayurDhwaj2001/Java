public class AnagramChecker {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.length() == s2.length()) {
            return true;
        }
        char ch = s1.charAt(0);
        return isAnagram(s1.replace(ch + "", ""), s2.replace(ch + "", ""));
    }

    public static void main(String[] args) {
        String s1 = "peek".toLowerCase();
        String s2 = "keep".toLowerCase();
        System.out.println(isAnagram(s1, s2));
    }
}
