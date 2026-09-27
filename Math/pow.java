public class pow {
    public static int power(int num, int p) {
        int total = 1;
        for (int i = 0; i < p; i++) {
            total = total * num;
        }
        return total;
    }

    public static void main(String[] args) {
        int a = power(3, 3);
        System.out.println(a);
    }
}