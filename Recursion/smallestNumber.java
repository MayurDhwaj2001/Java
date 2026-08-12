public class smallestNumber {
    public static int smallest(int n, int sma) {
        if (n == 0) {
            return sma;
        }
        if (n % 10 < sma) {
            sma = n % 10;
        }
        return smallest(n / 10, sma);
    }

    public static void main(String[] args) {
        int a = smallest(21342, 9);
        System.out.println(a);
    }
}
