public class ContainParticularDigit {
    public static boolean particulardigit(int num, int toFind) {
        if (num == 0) {
            return false;
        }
        if (num % 10 == toFind) {
            return num % 10 == toFind;
        }
        return particulardigit(num / 10, toFind);
    }

    public static void main(String[] args) {
        boolean a = particulardigit(22154, 2);
        System.out.println(a);
    }
}
