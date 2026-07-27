//         *         
//       *   *       
//     *       *     
//   *           *   
// *               * 
//   *           *   
//     *       *     
//       *   *       
//         *      
public class p28 {
    public static void main(String[] args) {
        int num = 5;
        int size = (num * 2) - 1; // 9
        int mid = size / 2; // 4
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i - j == mid || j - i == mid || i + j == mid || i + j == size + mid - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
