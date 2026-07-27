// 1                       0     1
// 3 2                    1       2
// 4 5 6                   2     3
// 7 8 9 10               3       4
// 11 12 13 14 15          4     5
public class p22 {
    public static void main(String[] args) {
        int count = 1;
        int odd = 1;
        int even = odd + 2;
        int num = 5;
        int star = 1;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                odd = (i * 2) - 1;
                for (int j = 1; j <= star; j++) {
                    System.out.print(odd);
                }
            } else {
                int start = count + i - 1;

                for (int j = 1; j <= star; j++) {
                    System.out.print(even);
                }
            }
            System.out.println();
            star++;
        }
    }
}
