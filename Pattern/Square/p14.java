// A 2 3 4 5 
// 1 A 3 4 5 
// 1 2 A 4 5 
// 1 2 3 A 5 
// 1 2 3 4 A 
public class p14 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("A ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }
}
