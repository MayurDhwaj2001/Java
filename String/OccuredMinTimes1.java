public class OccuredMinTimes1 {
    public static void main(String[] args) {
        String s1 = "ababaababc";
        String s2 = "";
        int min = s1.length();
        char res = ' ';

        while (s1.length() > 0) {
            char ch = s1.charAt(0);
            s2 = s1.replace(ch + "", "");
            int count = s1.length() - s2.length();
            if (min > count) {
                min = count;
                res = ch;
            }
            s1 = s2;
        }
        System.out.println(res);
    }
}
