//     *
//    *   *
//   *     *
//  *       *
// *********
public class p20 {
    public static void main(String[] args) {
        int n = 5;
        int blank = n - 1;// 4
        int gap = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = blank; j > 0; j--) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print("*");
            }
            if (i == n) {
                for (int k = 1; k <= (n * 2) - 1; k++) {
                    System.out.print("*");
                }
            } else if (i != n && i != 1) {
                System.out.print("*");
                for (int k = 1; k <= gap; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            gap += 2;
            System.out.println();
            blank--;
        }
    }
}
