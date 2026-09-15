//         1               1,1
//       1 2 1             2,3
//     1 2 3 2 1           3,5
//   1 2 3 4 3 2 1         4,7
// 1 2 3 4 5 4 3 2 1       5,9
public class p1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int space = n - 1; space >= i; space--) { // Left Blank Space
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // Increasing numbers
                System.out.print(j + " ");
            }
            for (int k = i - 1; k >= 1; k--) {// Decreasing Numbers
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}