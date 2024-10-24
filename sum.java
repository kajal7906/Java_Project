import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int n,sum=0;
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
            System.out.println("The sum of elements are:");
            for ( int j = 0; j < n; j++) {
                sum += a[j];
            }
            System.out.println("The sum is" + sum);
        }
    }
    

