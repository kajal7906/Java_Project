
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Initialize the TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Kajal", 1);
        treeMap.put("", 2);
        treeMap.put("Three", 3);

        // Display the initial TreeMap
        System.out.println("Initial TreeMap: " + treeMap);

        // Remove the entry associated with the key "Two"
        Integer removedValue = treeMap.remove("Two");

        // Check if the entry for "Three" is removed
        boolean isThreeRemoved = !treeMap.containsKey("Three");

        // Display the results
        System.out.println("Removed value = " + removedValue); // Output: Removed value = 2
        System.out.println("Is the entry {Three=3} removed? " + isThreeRemoved); // Output: False
        System.out.println("Updated TreeMap: " + treeMap); // Output: Updated TreeMap: {One=1, Three=3}
    }
}
