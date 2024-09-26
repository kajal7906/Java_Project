import java.util.Scanner;

public class max_num {
    public static void main(String[] args) {
        System.out.println(" Enter Two numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max= (n>m) ? n : m;
         System.out.println("The maximum number among these two is :" + max);
    }
}
