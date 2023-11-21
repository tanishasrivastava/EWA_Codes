import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        Map<String, Integer> populationMap = new TreeMap<>();

        // Adding key-value pairs to the map
        populationMap.put("India", 1380004385);
        populationMap.put("China", 1444216107);
        populationMap.put("United States", 331002651);
        populationMap.put("Indonesia", 273523615);
        populationMap.put("Pakistan", 220892331);

        // Printing key-value pairs
        printKeyValuePairs(populationMap);
    }

    private static void printKeyValuePairs(Map<String, Integer> map) {
        System.out.println("TreeMap Key-Value Pairs:");

        // Iterating through the entries of the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
