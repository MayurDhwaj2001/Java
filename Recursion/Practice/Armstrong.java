public class Armstrong {
    public static boolean isArmstrong(int n, int m, int sum) {
        if (n == 0) {
            return sum == m;
        }

        return isArmstrong(n / 10, m, sum + Math.pow(n / 10, (m + "".length())));
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153, 153, 0, 0));
    }
}
