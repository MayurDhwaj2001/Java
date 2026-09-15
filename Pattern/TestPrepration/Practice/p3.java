
// 1         
// 1 2       
// 1   3     
// 1     4   
// 1 2 3 4 5 

public class p3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == j || i == n) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
