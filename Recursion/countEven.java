public class countEven {
    public static int evenCount(int n, int count) {
        if (n == 0) {
            return count;
        }
        if ((n % 10) % 2 == 0) {
            count += 1;
        }
        return evenCount(n / 10, count);
    }

    public static void main(String[] args) {
        int a = evenCount(34822, 0);
        System.out.println(a);
    }
}
