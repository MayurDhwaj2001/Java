//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 

public class p19 {
    public static void main(String[] args) {

        int n = 5;
        int blank = n - 1; // 4
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < blank; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }
            blank--;
            star += 2;
            System.out.println();
        }
    }
}
