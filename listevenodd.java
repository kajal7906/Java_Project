import java.util.Scanner;

public class listevenodd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The elements are:");
        for (int j = 0; j < n; j++) {
            System.out.println(a[j]);

        }
        System.out.println("Even Numbers are:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0)
                System.out.print(a[i] + " ");
        }

        System.out.println("\nOdd Numbers are:");
        for (int i = 0; i < n; i++) {

            if (a[i] % 2 != 0)
                System.out.print(a[i] + " ");

        }

    }
}
