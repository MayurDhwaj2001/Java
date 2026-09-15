public class SwapString {
    public static void main(String[] args) {
        String a = "ram";
        String b = "sita";

        System.out.println("b=" + b);
        System.out.println("a=" + a);
        a = b + a;
        b = a.substring(b.length(), a.length());
        a = a.substring(0, a.length() - b.length());
        System.out.println("b=" + b);
        System.out.println("a=" + a);
    }
}
