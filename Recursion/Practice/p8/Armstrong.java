public class Armstrong {
    public static boolean isArmstrong(int n, int m, int len, int sum) {
        if (n == 0) {
            return (m == sum);
        }
        return isArmstrong(n / 10, m, len, sum + (int) Math.pow(n % 10, len));
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153, 153, (153 + "").length(), 0));
    }
}
