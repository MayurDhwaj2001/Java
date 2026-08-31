public class reverseSentence {
    public static void main(String[] args) {
        String str = " Mayur is  a good boy  ";
        str = str.strip();
        String sentence = "";
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            sentence += " " + words[i];
        }
        System.out.println(sentence);
    }
}