import java.util.Scanner;

public class excep {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("You cannot vote");
        else
            System.out.println("You can  vote");
    }

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        validate(age);
    }

}
