import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n!=0){
            int rem = n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println("The sum of digits is: " + sum);
    }
}
