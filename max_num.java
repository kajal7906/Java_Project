
// finding maximum of two numbers
import java.util.Scanner;

public class max_num {
    public static void main(String[] args) {
        System.out.println(" Enter Two numbers: "); // taking input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = (n > m) ? n : m; // Ternary operator for finding maximum...
        System.out.println("The maximum number among these two is :" + max);
    }
}
