//         1               1,1
//       1 2 1             2,3
//     1 2 3 2 1           3,5
//   1 2 3 4 3 2 1         4,7
// 1 2 3 4 5 4 3 2 1       5,9

public class p2 {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = row - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println("");
        }
    }
}