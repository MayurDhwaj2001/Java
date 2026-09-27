public class guessAnswer {
    public static int m(int a) {
        return a++;
    }

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = m(++i) + m(j++);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
