public class EvenOdd {

    public static void main(String[] args) {
        System.out.println("Even and Odd Numbers between 0 to 100 are: ");

        System.out.println("Even Numbers are:");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i +" ");
        }
        System.out.println("\nOdd Numbers are:");
        for (int i = 0; i <= 100; i++) {

            if (i % 2 != 0)
                System.out.print(i + " ");

        }
    }
}
