// 1                       
// 3 2                    
// 4 5 6                   
// 7 8 9 10                      
// 11 12 13 14 15          
public class p22 {
    public static void main(String[] args) {
        int num = 5;
        int count = 1;

        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                // Even row: print first number separately
                System.out.print(count + 1 + " ");
                System.out.print(count);
                count += 2;

                // Print remaining numbers
                for (int j = 3; j <= i; j++) {
                    System.out.print(" " + count);
                    count++;
                }
            } else {
                // Odd row: normal printing
                for (int j = 1; j <= i; j++) {
                    System.out.print(count + " ");
                    count++;
                }
            }

            System.out.println();
        }
    }
}