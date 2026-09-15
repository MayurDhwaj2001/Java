public class test {
    public static String swap(String s, int i, int j) {

        char[] sch = s.toCharArray();

        char temp = sch[i];
        sch[i] = sch[j];
        sch[j] = temp;

        return new String(sch);
    }

    public static void permutation(String s, int begin, int end) {

        if (begin == end) {
            System.out.println(s);
            return;
        }
        for (int i = begin; i <= end; i++) {
            String res = swap(s, begin, i);
            permutation(res, begin + 1, end);
        }
    }

    public static void main(String[] args) {

        String s = "abc";
        permutation(s, 0, s.length() - 1);
    }
}
