//     A
//   B   C 
// D E F G H
// 
//        A
//      B   C
//    D       E
//  F G H I J K L
// 
//         A
//       B   C
//     D       E
//   F           G
// H I J K L M N O P
public class p3 {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if (j + i == 6 || j - i == 4 || i == n) {
                    System.out.print(ch++ + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}