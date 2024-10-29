import java.util.HashSet;

public class Hash_set {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> mySet = new HashSet<>();

        // Add some initial elements
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");

        // Display the HashSet before adding the new element
        System.out.println("HashSet before adding the element: " + mySet);
        
        // Append the specified element
        boolean isAdded = mySet.add("Mango");

        // Display the result of the addition
        if (isAdded) {
            System.out.println("Element added to the HashSet.");
        } else {
            System.out.println("Element  was already in the HashSet.");
        }

        // Display the HashSet after adding the new element
        System.out.println("HashSet after adding the element: " + mySet);
    }
}


