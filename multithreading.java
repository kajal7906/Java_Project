import java.util.Scanner;

class demo1 extends Thread
{
    public void run()   //it become thread class
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("addition started...");
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Addition of a and b is: " + c);
        System.out.println("Addition completed...");
    }
}
class demo2 extends Thread 
{
   public void run(){
        System.out.println("Number printing task started...");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try{
            Thread.sleep(2000);
            }catch( InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Number printing task completed....");
    }
}

public class multithreading {
    public static void main(String[] args) {

        demo1 d1 = new demo1();
        demo2 d2 = new demo2();
        d1.start();
        d2.start();
       
        // Scanner sc = new Scanner(System.in);
        // System.out.println("addition started...");
        // System.out.println("Enter first number");
        // int a = sc.nextInt();
        // System.out.println("Enter second number");
        // int b = sc.nextInt();
        // int c = a + b;
        // System.out.println("Addition of a and b is: " + c);
        // System.out.println("Addition completed...");
        // System.out.println("Number printing task started...");
        // for (int i = 0; i <= 5; i++) {
        //     System.out.println(i);
        //     Thread.sleep(2000);
        // }
        // System.out.println("Number printing task completed....");
    }
}
