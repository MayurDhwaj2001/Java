public class StringPermutation {
    public static String swap(String str, int i, int j) {

        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);

    }

    public static void permutaion(String s, int beg, int end) {

        if (beg == end) {
            System.out.println(s);
            return;
        }
        for (int i = beg; i <= end; i++) {
            String s1 = swap(s, beg, i);
            permutaion(s1, beg + 1, end);
        }

    }

    public static void main(String[] args) {
        String s = "abc";
        permutaion(s, 0, s.length() - 1);
    }
}
