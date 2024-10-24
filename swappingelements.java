import java.util.ArrayList;
import java.util.Collections;

public class swappingelements {
    public static void main(String[] args) {
        // Creating arraylist
        ArrayList<Integer> list = new ArrayList<>();
      
        // adding elements

        list.add(100);
        list.add(2);
        list.add(87);
        list.add(90);
        System.out.println("List is " + list);

        // swapping in list

        Collections.swap(list, 0, 3);
        System.out.println("List after swapping is " + list);

        // reversing the list

        Collections.reverse(list);
        System.out.println("List after reversing is " + list);

        //sorting the list

        Collections.sort(list);
        System.out.println("List after sorting is " + list);



    }
}
