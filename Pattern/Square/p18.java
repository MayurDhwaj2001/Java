//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 

public class p18 {
    public static void main(String[] args) {
        int n = 5;
        int blank = 4;
        int star = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = blank; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }
            System.out.println();
            blank--;
            star++;
        }

        System.out.println();
    }
}
