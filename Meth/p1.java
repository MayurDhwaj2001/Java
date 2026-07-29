public record p1() {
    public static void m1(int... a) {
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    public static void main(String[] args) {
        m1(19, 20);
    }
}
