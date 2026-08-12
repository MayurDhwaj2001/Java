public class occurrencesOfADigit {
    public static int occurrences(int n, int toFind, int occur) {
        if (n == 0) {
            return occur;
        }
        if (n % 10 == toFind) {
            occur += 1;
        }
        return occurrences(n / 10, toFind, occur);
    }

    public static void main(String[] args) {
        int a = occurrences(22224, 2, 0);
        System.out.println(a);
    }
}
