import java.util.Map;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Alice", 25);
        ages.put("Bob", 30);

        System.out.println(ages.get("Alice"));
        System.out.println(ages.containsValue(25));
        System.out.println(ages.containsKey("Bob"));

        // Interate for each
    }
}
// singleton