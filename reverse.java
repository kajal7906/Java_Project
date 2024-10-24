import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int n, k, count = 0;
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
        System.out.println("reverse elements are:");
        for (int i = n - 1; i > 0; i--) {
            System.out.print(a[i] + " ");
        }

    }
}