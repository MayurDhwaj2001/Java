public class OccuredMaxTimes1 {
    public static void main(String[] args) {
        String s1 = "aaababaababc";
        String s2 = "";
        char res = ' ';
        int max = 0;

        while (s1.length() > 0) {
            char ch = s1.charAt(0);
            s2 = s1.replace(ch + "", "");
            int count = s1.length() - s2.length();
            if (count > max) {
                max = count;
                res = ch;
            }
            s1 = s2;
        }
        System.out.println(res);
    }
}
