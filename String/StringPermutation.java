public class StringPermutation {
    public static String swap(String s, int beg, int end) {
        char[] ch = s.toCharArray();
        char temp = ch[beg];
        ch[beg] = ch[end];
        ch[end] = temp;
        return new String(ch);
    }

    public static void permutation(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
            return;
        }
        for (int i = start; i <= end; i++) {
            String s = swap(str, start, i);
            permutation(s, start + 1, end);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        permutation(s, 0, s.length() - 1);
    }
}