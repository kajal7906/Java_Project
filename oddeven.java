import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
         int n,Evencount=0,Oddcount=0;
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
        for(int i = 0;i<n;i++){
            if( a[i] %2== 0){
            Evencount++;
            }
            else{
                Oddcount++;
            }
        }
        System.out.println("even numbers are: " + Evencount + "Odd numbers are: " + Oddcount);
        }
    }

