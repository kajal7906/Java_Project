import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        try{
            int c = a/b;
            System.out.println("C  " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception" + e);
        }
        System.out.println("End od the code");


    }
}
