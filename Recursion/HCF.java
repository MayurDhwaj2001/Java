// Factors of 8: 1, 2, 4, 8
// Factors of 20: 1, 2, 4, 5, 10, 20
// Common factors: 1, 2, 4
// Highest common value: 4

public class HCF {
    public static int findHCF(int n, int m, int j, int highestHCF) {
        if (j > m) {
            return highestHCF;
        }
        if (n % j == 0 && m % j == 0) {
            highestHCF = j;
        }
        return findHCF(n, m, j + 1, highestHCF);
    }

    public static void main(String[] args) {
        System.out.println(findHCF(8, 20, 1, 1));
    }
}
