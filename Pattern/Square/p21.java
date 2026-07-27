//     1
//    121
//   12321
//  1234321
// 123454321

public class p21 {
    public static void main(String[] args) {
        int rev = 1;
        int num = 5;
        int blank = 4;
        for (int i = 1; i <= num; i++) {
            for (int l = blank; l > 0; l--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rev; j++) {
                System.out.print(j);
            }
            for (int k = rev - 1; k > 0; --k) {
                System.out.print(k);
            }
            rev++;
            blank--;
            System.out.println();
        }
    }
}
