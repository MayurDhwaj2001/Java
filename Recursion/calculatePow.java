public class calculatePow {
    public static int pow(int n, int pow) {
        if (pow == 0) {
            return 1;
        }
        return n * pow(n, pow - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        int pow = 5;
        int a = pow(num, pow);
        int b = (int) Math.pow(num, pow);

        if (a == b) {
            System.out.println("true");
        } else
            System.out.println(a + "false" + b);
    }

}
