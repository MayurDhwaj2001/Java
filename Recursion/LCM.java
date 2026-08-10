// Multiples of (6): (6, 12, 18, {24}, 30, 36,....)
// Multiples of (8): (8, 16, {24}, 32, 40,....)
public class LCM {
    public static int findLCM(int n, int m, int i) {
        if (i % m == 0 && i % n == 0) {
            return i;
        }
        return findLCM(n, m, i + 1);
    }

    public static void main(String[] args) {
        int small = 6;
        int big = 8;
        if (small > big) {
            int c = small;
            small = big;
            big = c;
        }
        System.out.println(findLCM(small, big, big));
    }
}
