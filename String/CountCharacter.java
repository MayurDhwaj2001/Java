import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static void main(String[] args) {
        String input = "javadev";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (map.containsKey(c)) {
                int oldCount = map.get(c);
                map.put(c, oldCount + 1);
            } else {
                map.put(c, 1);
            }
        }

        // Print the result
        for (char key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
    }
}
