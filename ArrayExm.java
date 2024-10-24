//Program of ArrayIndexOutOfBoundsException

public class ArrayExm {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; // Array elements
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Array Elements are:" + arr[i]); // printing array elements
            }
        } catch (ArrayIndexOutOfBoundsException e) // catching exception if occurs
        {
            System.out.println("Array Index out of bound");
        }
    }
}
