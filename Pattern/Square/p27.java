// 1 
// 3 2 
// 4 5 6 
// 10 9 8 7 
// 11 12 13 14 15 
public class p27 {
    public static void main(String[] args) {
        int start = 1;
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (i % 2 == 0)
                    System.out.print((start + i - j) + " ");
                else
                    System.out.print((start + j - 1) + " ");
            }

            start += i;
            System.out.println();
        }
    }
}
