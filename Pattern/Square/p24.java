//         *         
//       *   *       
//     *       *     
//   *           *   
// *               * 
//   *           *   
//     *       *     
//       *   *       
//         *         
public class p24 {
    public static void main(String[] args) {
        int n = 5;
        int size = 2 * n - 1;
        int mid = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (j == Math.abs(mid - i) ||
                        j == size - 1 - Math.abs(mid - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
