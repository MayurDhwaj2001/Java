// 1110 -> 8420 = 14
public class BinaryToDecimal {
    public static int BtoD(int n, int sum, int pow) {
        if (n == 0) {
            return sum;
        }
        return BtoD(n / 10, sum + n % 10 * pow, pow * 2);
    }

    public static void main(String[] args) {
        System.out.print(BtoD(1110, 0, 1));
    }
}
