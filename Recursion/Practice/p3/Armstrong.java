// 153 1^3+5^3+3^3 =153
public class Armstrong {

    public static boolean isArmstrong(int n, int m, int sum, int len) {
        if (n == 0) {
            return m == sum;
        }
        return isArmstrong(n / 10, m, sum + (int) Math.pow(n % 10, len), len);
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153, 153, 0, (153 + "").length()));
    }
}
