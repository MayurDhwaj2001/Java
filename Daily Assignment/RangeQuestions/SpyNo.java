// code to print 2nd highest spy number
public class SpyNo {
    public static void main(String[] args) {
        int spyCount = 1;
        for (int i = 400; i <= 100; i--) {
            int n = i;
            int sum = 0;
            int prod = 1;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                prod *= r;
                n /= 10;
            }
            if (sum == prod) {
                spyCount++;
                if (spyCount == 2) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
