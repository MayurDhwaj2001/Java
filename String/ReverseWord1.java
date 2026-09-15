public class ReverseWord1 {
    public static void main(String[] args) {
        String s = " Java  is  Easy    ";
        s = s.trim().replaceAll(" +", " ");
        String rev = "";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            rev = ch[i] + rev;
        }
        System.out.println(rev);
    }
}
