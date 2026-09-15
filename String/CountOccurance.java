public class CountOccurance {
    public static void main(String[] args) {
        String s1 = "javadev";
        s1 = s1.toLowerCase();
        String s2 = "";

        while (s1.length() > 0) {
            char ch = s1.charAt(0);
            s2 = s1.replace(ch + "", "");
            System.out.println(s1.length() - s2.length());
            s1 = s2;
        }
    }
}
