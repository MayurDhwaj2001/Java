// A 2 3 4 5 
// 1 B 3 4 5 
// 1 2 C 4 5 
// 1 2 3 D 5 
// 1 2 3 4 E 
public class p15 {
    public static void main(String[] args) {

        int n = 5;
        char c = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(c + " ");
                    c++;
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }
}
