public class StringPermutation2 {
    public static String swap(String s, int beg, int end) {
        char[] ch = s.toCharArray();
        char temp = ch[beg];
        ch[beg] = ch[end];
        ch[end] = temp;

        return new String(ch);
    }

    public static void permutation(String s, int beg, int end) {
        if (beg == end) {
            System.out.println(s);
            return;
        }
        for (int i = beg; i <= end; i++) {
            String s1 = swap(s, i, beg);
            permutation(s1, beg + 1, end);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        permutation(s, 0, s.length() - 1);
    }
}
