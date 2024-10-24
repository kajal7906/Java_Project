import java.util.Scanner;

public class empty {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        n = sc.nextInt();
        int a[] = new int[n];
        int a1[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The elements are:");
        for (int j = 0; j < n; j++) {
            System.out.println(a[j]);
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                a1[j] = a[i];
                j++;

            }
        }
        System.out.println("even elements: ");
        for (int i = 0; i < j; i++) {
            System.out.print(a1[i] + " ");
        }

    }
}
