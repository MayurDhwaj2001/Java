public class StringPermutation2 {
    public static void permutation(String a, int i, int j) {

    }

    public static String swap(String s, int beg, int end) {
        char[] ch = s.toCharArray();
        char temp = ch[beg];
        ch[end] = ch[beg];
        ch[beg] = temp;
        return ch + "";
    }

    public static void main(String[] args) {
        String a = "abc";
        permutation(a, 0, a.length() - 1);
    }
}
