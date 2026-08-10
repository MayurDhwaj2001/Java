public class p1 {
    static void m1(int i) {
        System.out.println(i);
        if (i >= 3) {
            return;
        }
        m1(i + 1);
        System.out.println("m" + i + " ends");
    }

    public static void main(String[] args) {
        m1(1);
    }
}
