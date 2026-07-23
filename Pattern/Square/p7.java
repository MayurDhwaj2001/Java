// *       * 
//   *   *   
//     *     
public class p7 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == 6) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
// (ij)
// 11 12 13 14 15
// 21 22 23 24 25
// 31 32 33 34 45
// 41 42 43 44 45
// 51 52 53 54 55