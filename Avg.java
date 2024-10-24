import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        int Average,sum=0,grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of English");
        int eng = sc.nextInt();
        System.out.println("Enter the marks of Maths");
        int math = sc.nextInt();
        System.out.println("Enter the marks of Science");
        int sci = sc.nextInt();

         Average = (eng + math + sci)/3;  //average  = total marks / number of subjects
         System.out.println("Average of three subjects is :" + Average);

         if(Average >= 90)
         System.out.println("A grade");
         else if (Average >= 70)
         System.out.println("B grade");
         else if (Average >= 50)
         System.out.println("C grade");
         else if (Average >= 40)
         System.out.println("Pass");
    }
    }
    

