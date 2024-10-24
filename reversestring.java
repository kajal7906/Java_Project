import java.util.*;
public class reversestring  {
    public static void main(String[] args) {
        // Creating a list of strings
        List<String> stringList = new ArrayList<>();
        //adding element to the list
        stringList.add(new String("Kajal")) ; 
        stringList.add(new String("Neetu")) ; 
        stringList.add(new String("Parnita")) ; 
        stringList.add(new String("Khushi")) ; 
        stringList.add(new String("Amayra")) ;      
        // Printing the original list
        System.out.println("Original List  is: " + stringList);
        
        // Reversing the list
        Collections.reverse(stringList);
        
        // Printing the reversed list
        System.out.println("Reversed List is : " + stringList);
    }
}


