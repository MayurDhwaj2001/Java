public class factorial {
    public static int fact(int n) {
        int res = 1;
        while (n > 0) {
            res = res * n;
            n--;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(fact(num));
    }
}
