public class test3 {
    public static String swap(String s, int i, int j) {
        char[] ch = s.toCharArray();
        char temp = ' ';
        temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }

    public static void permutation(String s, int begin, int end) {
        if (begin == end) {
            System.out.println(s);
            return;
        }
        for (int i = begin; i <= end; i++) {
            String s2 = swap(s, begin, i);
            permutation(s2, begin + 1, end);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        permutation(s, 0, s.length() - 1);
    }
}
