import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs to the map
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 87);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 78);
        studentScores.put("Emma", 89);

        // Printing key-value pairs
        printKeyValuePairs(studentScores);
    }

    private static void printKeyValuePairs(Map<String, Integer> map) {
        System.out.println("HashMap Key-Value Pairs:");

        // Iterating through the entries of the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
