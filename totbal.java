import java.util.*;
// import java.util.Scanner;

class Bank{
    public double amount;

Bank(double a ){
    amount = a;
}
 void withDraw(double withdrawlAmout){
    String withdrawl = (amount > withdrawlAmout) ?"Withdrawl successful" : "Cannot withdrawl";
    amount -= withdrawlAmout;
    System.out.println(withdrawl);
 }
 void depositAmount(double depositAmount){
    amount += depositAmount;    
 }
}



public class totbal {
     public static void main(String[] args) {
        Bank obj = new Bank(10000);
        System.out.println("Enter the amount to be withdrawl");
        Scanner sc = new Scanner(System.in);
        double amount1 = sc.nextDouble();
        obj.withDraw(amount1);
        obj.depositAmount(5000);
        System.out.println("Total Balance is " + obj.amount);
     }
}
