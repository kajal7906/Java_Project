import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // int a[] = {3,7,8,1,45};
        // System.out.println(a[3]); //1

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
           System.out.println("The elements are:");
            for ( int j = 0; j < n; j++) {
                System.out.println(a[j]);
            }
        }

    }


