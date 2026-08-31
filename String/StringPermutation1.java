public class StringPermutation1 {
    public static String swap(String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }

    public static void palindrome(String s, int beg, int end) {
        if (beg == end) {
            System.out.println(s);
            return;
        }
        for (int i = beg; i <= end; i++) {
            String st = swap(s, beg, i);
            palindrome(st, beg + 1, end);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        palindrome(s, 0, s.length() - 1);
    }
}
