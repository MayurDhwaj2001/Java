public class OccuranceOfDuplicateChar {
    public static void main(String[] args) {
        String s = "hello world";
        // he121 w2r3d
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
                char count = '0';
                for (int j = 0; j <= i; j++) {
                    if (s.charAt(j) == s.charAt(i)) {
                        count++;
                    }
                }
                ch[i] = count;
            }
        }
        System.out.println(ch);
    }
}