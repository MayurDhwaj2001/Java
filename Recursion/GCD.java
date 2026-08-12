public class GCD {
    public static int greatest(int n1, int n2, int i) {
        if (i == 1) {
            return i;
        }
        if (n1 % i == 0 && n2 % i == 0) {
            return i;
        }
        return greatest(n1, n2, i - 1);
    }

    public static void main(String[] args) {
        int a = greatest(48, 18, 18);
        System.out.println(a);
    }
}
