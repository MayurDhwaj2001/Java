//     1
//   1 2 1
// 1 2 3 2 1
//   1 2 1
//     1
public class p4 {
    public static void main(String[] args) {
        int n = 3;
        int size = (2 * n) - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {

                int distance = Math.abs(n - i) + Math.abs(n - j);

                if (distance < n) {
                    System.out.print((n - distance) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}