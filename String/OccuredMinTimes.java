
public class OccuredMinTimes {
    public static void main(String[] args) {
        String s1 = "aabbaababac";
        String s2 = "";
        char ret = ' ';
        int min = s1.length();
        while (s1.length() > 0) {
            char ch = s1.charAt(0);

            s2 = s1.replace(ch + "", "");
            int count = s1.length() - s2.length();

            if (min > count) {
                min = count;
                ret = ch;
            }
            s1 = s2;
        }
        System.out.println(ret);

    }
}
