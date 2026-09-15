//         A
//       B   C
//     D       E
//   F           G
// H I J K L M N O P

public class p4 {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5;
        int col = (n * 2) - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= col; j++) {
                if (j + i == 6 || j - i == 4 || i == n) { // If its border
                    System.out.print(ch++ + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
