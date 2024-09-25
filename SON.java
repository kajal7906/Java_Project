import java.util.Scanner;

public class SON {

    public static void main(String[] args) {
        int N,sum=0;
        System.out.println("Enter the value of N");
        Scanner sc = new Scanner(System.in);
         N= sc.nextInt();
         for(int i=0;i<N;i++){
            sum=sum+i;
         }
         System.out.println("The sum of " + N + " numbers is: " + sum);
    }
}