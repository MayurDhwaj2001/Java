public class sumTillLastDigir {
    public static int sum(int n, int sum) {
        if (n == 0) {
            if (sum > 9) {
                return sum(sum, 0);
            }
            return sum;
        }
        return sum(n / 10, sum + n % 10);
    }

    public static void main(String[] args) {
        System.out.println(sum(12345, 0));
    }
}
