public class OccuranceOfDuplicateCharacter {
    public static void main(String[] args) {
        String s = "hello world";

        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char count = 'a';
            for (int j = i + 1; j < s.length(); j++) {
                if (ch[i] >= '0' && ch[i] <= '9') {
                    continue;
                }
                if (ch[i] == ch[j]) {
                    ch[j] = ++count;
                }
            }
            if (count > 1) {
                ch[i] = '1';
            }
        }
        System.out.println(ch);
    }
}
