//       A 
//     B 1 C
//   D 2 3 4 E
// F G H I J K L 

public class p8 {
    public static void main(String[] args) {
        int num = 4;
        int size = (num * 2) - 1;
        int count = 1;
        char ch = 'A';

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (k == 1 || k == (2 * i) - 1 || i == num) {
                    System.out.print(ch++ + " ");
                } else {
                    System.out.print(count++ + " ");
                }
            }
            System.out.println();
        }
    }
}