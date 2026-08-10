public class DtoB {
    public static String DecimalToBinary(int n, String sum) {
        if (n == 0) {
            return sum;
        }
        return DecimalToBinary(n / 2, n % 2 + sum);
    }

    public static void main(String[] args) {
        System.out.println(DecimalToBinary(14, ""));
    }
}
