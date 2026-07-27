// 1 // 1 
// 2 // 3 2 
// 3 // 4 5 6 
// 4 // 10 9 8 7 
// 5 // 11 12 13 14 15 
public class p29 {
    public static void main(String[] args) {
        int num = 5;
        int start = 1;
        for (int row = 1; row <= num; row++) {
            int first = start;
            int last = first + row - 1;
            if (row % 2 != 0) {
                // System.out.print("first=" + first + " last= " + last + " row=" + row + " |
                // ");
                for (int i = first; i <= last; i++) {
                    System.out.print(i + " ");
                }

            } else {
                // System.out.print("first=" + first + " last= " + last + " row=" + row + " |
                // ");
                for (int i = last; i >= first; i--) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            start = start + row;
        }
    }
}
