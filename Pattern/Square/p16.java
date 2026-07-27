// 1 2 3 4 5 
// 5 4 3 2 1 
// 1 2 3 4 5 
// 5 4 3 2 1 
// 1 2 3 4 5 
public class p16 {
    public static void main(String[] args) {

        int n = 5;
        int num = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    ++num;
                    System.out.print(num + " ");
                } else {
                    System.out.print(num + " ");
                    --num;
                }
            }
            System.out.println("");
        }
    }
}
