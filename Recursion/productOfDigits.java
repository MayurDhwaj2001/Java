public class productOfDigits {
    public static int pro(int n, int res) {
        if (n == 0) {
            return res;
        }
        return pro(n / 10, res * n % 10);
    }

    public static void main(String[] args) {
        int a = pro(133, 1);
        System.out.println(a);
    }
}
