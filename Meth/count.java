public class count {
    public static int countDigit(int a) {
        int count = 0;
        while (a > 0) {
            a /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 7463;

        System.out.println(countDigit(a));
    }
}
