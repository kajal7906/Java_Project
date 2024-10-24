
import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int originalnum = num;
        while (num != 0) {
            int d = num % 10;
            int fac = 1;

            for (i = 1; i <= d; i++) {
                fac = fac * i;
            }
            sum += fac;
            num = num / 10;
        }
        if (sum == originalnum)
            System.out.println("it is strong number");
        else
            System.out.println("not strong");
    }

}
