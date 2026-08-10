public class ArmstringNumber {
    public static boolean isArmstrong(int n, int m, int sum, int len) {
        if (n == 0) {
            return m == sum;
        }
        return isArmstrong(n / 10, m, sum + (int) Math.pow(n % 10, len), len);
    }

    public static void find(int i) {
        int len = (i + "").length();
        System.out.println(isArmstrong(i, i, 0, len));
    }

    public static void main(String[] args) {
        find(370);
    }
}
