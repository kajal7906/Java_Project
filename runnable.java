import java.util.Scanner;

class demo1 implements Runnable {
    public void run() // it become thread class
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

class demo2 implements Runnable {
    public void run() {
        System.out.println("Number printing task started...");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Number printing task completed....");
    }
}

public class runnable {
    public static void main(String[] args) {

        demo1 d1 = new demo1();
        demo2 d2 = new demo2();
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        t1.start();
        t2.start();

    }
}
