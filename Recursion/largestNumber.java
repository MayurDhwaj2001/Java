public class largestNumber {
    public static int largest(int n, int lar) {
        if (n == 0) {
            return lar;
        }
        if (n % 10 > lar) {
            lar = n % 10;
        }
        return largest(n / 10, lar);
    }

    public static void main(String[] args) {
        int a = largest(278936792, 0);
        System.out.println(a);
    }
}
