public class OccuredMaxTimes {
    public static void main(String[] args) {
        String s1 = "javadev";
        String s2 = "";

        int max = 0;
        char ret = ' ';
        while (s1.length() > 0) {
            char ch = s1.charAt(0);
            s2 = s1.replace(ch + "", "");
            int count = (s1.length() - s2.length());
            if (count > max) {
                max = count;
                ret = ch;
            }
            s1 = s2;
        }
        System.out.println(ret);
    }
}
