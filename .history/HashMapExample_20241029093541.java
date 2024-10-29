
 import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, String> map = new HashMap<>();

        // Associate specified values with specified keys
        map.put("1", "Agra");
        map.put("2", "Mumbai");
        map.put("3", "Cherry");

        // Display the HashMap
        System.out.println("HashMap contents: " + map);

        // Adding another key-value pair
        String keyToAdd = "4";
        String valueToAdd = "Date";
        map.put(keyToAdd, valueToAdd);

        // Display the updated HashMap
        System.out.println("Updated HashMap after adding key " + keyToAdd + ": " + map);
    }
}


