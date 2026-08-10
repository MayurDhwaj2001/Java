public class ArmsrtongRange {
    public static boolean isArmstrong(int n, int m, int sum, int len) {
        if (n == 0) {
            return m == sum;
        }
        return isArmstrong(n / 10, m, sum + (int) Math.pow(n % 10, len), len);
    }

    public static void range(int start, int end) {
        int len;
        for (int i = start; i <= end; i++) {
            len = (i + "").length();
            if (isArmstrong(i, i, 0, len)) {
                System.out.println(i + " is Armstrong Number");
            }
        }
    }

    public static void main(String[] args) {
        range(152, 5555);
    }
}
