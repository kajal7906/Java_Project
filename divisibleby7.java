import java.util.Scanner;

public class divisibleby7 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 7 == 0){
            System.out.println("Number" + num +"is divisible by 7");
        }
        else{
            System.out.println("Not divisible");
        }
    }
}
