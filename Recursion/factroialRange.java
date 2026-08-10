public class factroialRange {

    public static int fact(int i) {
        if (i <= 1) {
            return 1;
        }
        return i * fact(i - 1);
    }

    public static void range(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i + "!= " + fact(i));
        }
    }

    public static void main(String[] args) {
        range(1, 20);
    }
}
