// Input: javadev  →  Output: javde
// Input: ja va dev  →  Output: ja_vde_
public class ReplaceDupicateCharacter {
    public static void main(String[] args) {
        String s = "ja va dev";
        char[] sc = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (sc[i] == '\u0000') {
                continue;
            }
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    sc[j] = '\u0000';
                }
            }
        }
        System.out.println(sc);
    }
}
