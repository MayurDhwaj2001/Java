public class reverseString {
    public static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = reverseString("MayurDhwaj");
        System.out.println(s);
    }
}
