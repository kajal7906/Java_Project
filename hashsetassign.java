import java.util.HashSet;

public class hashsetassign {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        // Adding initial elements to the hash set
        hashSet.add("apple");

        hashSet.add("banana");

        hashSet.add("cherry");

        // Element to be appended

        String elementToAppend = "date";

        // Appending the element to the hash set

        hashSet.add(elementToAppend);

        // Printing the updated hash set

        System.out.println("Updated HashSet: " + hashSet);
    }
}