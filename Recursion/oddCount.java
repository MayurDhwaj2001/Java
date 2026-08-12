public class oddCount {
    public static int countOdd(int n, int count) {
        if (n == 0) {
            return count;
        }
        if ((n % 10) % 2 != 0) {
            count += 1;
        }
        return countOdd(n / 10, count);
    }

    public static void main(String[] args) {
        int a = countOdd(42345, 0);
        System.out.println(a);
    }
}
