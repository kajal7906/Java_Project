import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class TreeMapNavigationExample {
    public static void main(String[] args) {
        // Initialize the TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        treeMap.put("Four", 4);
        treeMap.put("Five", 5);

        // 1. Using for-each loop on entrySet
        System.out.println("Using for-each loop:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 2. Using an iterator on entrySet
        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 3. Using keySet to navigate keys
        System.out.println("\nUsing keySet:");
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        // 4. Using values() to navigate values
        System.out.println("\nUsing values():");
        for (Integer value : treeMap.values()) {
            System.out.println("Value: " + value);
        }

        // 5. Using descendingMap to navigate in reverse order
        System.out.println("\nUsing descendingMap:");
        for (Map.Entry<String, Integer> entry : treeMap.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
