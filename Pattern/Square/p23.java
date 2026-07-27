//     *
//    *
//   *
//  *
// *
//  *
//   *
//    *
//     *
public class p23 {
    public static void main(String[] args) {
        int num = 5;
        int space = num - 1;
        // fisrt half dimond
        for (int i = 1; i <= num; i++) {
            // earlier blank space
            for (int k = space; k > 0; k--) {
                System.out.print(" ");
            }
            space--;
            System.out.print("*");
            System.out.println();
        }
        // bottom half dimond
        space = num - 1;
        for (int j = 1; j <= num - 1; j++) {
            // earlier blank space
            for (int k = space; k < num; k++) {
                System.out.print(" ");
            }
            space--;
            System.out.print("*");
            System.out.println();
        }
    }
}
