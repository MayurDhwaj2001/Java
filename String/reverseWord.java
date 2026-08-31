public class reverseWord {
    public static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String str = "  Mayur  Dhwaj  ";
        str = str.trim();
        String rev = "";
        String[] strArr = str.split(" ");
        for (int i = strArr.length - 1; i >= 0; i--) {
            rev = reverse(strArr[i]) + " " + rev;
        }
        System.out.println(rev);
    }
}