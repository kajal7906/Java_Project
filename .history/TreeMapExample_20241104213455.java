
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Initialize the TreeMap
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("One", "Kajal");
        treeMap.put("Two", "Naveen");
        treeMap.put("Three", "Parnita");

        // Display the initial TreeMap
        System.out.println("Initial TreeMap: " + treeMap);

        // Remove the entry associated with the key "Two"
        String removedValue = treeMap.remove("Two");

        System.out.println("Removed value = " + removedValue); // Output: Removed value = 2
        System.out.println("Updated TreeMap: " + treeMap); // Output: Updated TreeMap: {One=1, Three=3}
    }
}
