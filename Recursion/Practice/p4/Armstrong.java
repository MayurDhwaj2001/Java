public class Armstrong {
    public static boolean isArmstrong(int n, int m, int sum, int i) {
        if (n == 0) {
            return m == sum;
        }
        return isArmstrong(n / 10, m, sum + (int) Math.powExact(n % 10, i), 3);
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153, 153, 0, 3));
    }
}
