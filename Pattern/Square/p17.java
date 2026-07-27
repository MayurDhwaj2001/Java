// 1 2 3 4 5 
// 10 9 8 7 6 
// 11 12 13 14 15 
// 20 19 18 17 16 
// 21 22 23 24 25 
public class p17 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                int x = (i - 1) * n;
                for (int j = 1; j <= n; j++) {
                    x++;
                    System.out.print(x + " ");
                }
            } else {
                int x = n * i;
                for (int j = 1; j <= n; j++) {
                    System.out.print(x + " ");
                    x--;
                }
            }
            System.out.println();
        }
    }
}
