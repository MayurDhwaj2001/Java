public class armstrongNumber {
    public static void main(String[] args) {
        int num = 152;
    }

    public static int length(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static boolean isArmStrong(int n, int l) {
        int m = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            int pow = 1;
            for (int i = 1; i <= 1; i++) {
                pow *= r;
            }
            sum += pow;
            n /= 10;
        }
        return m == sum;
    }

    public static boolean isArmStrong(int n) {
        return isArmStrong(n, length(n));
    }
}
