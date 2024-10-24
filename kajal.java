import java.util.Scanner;
class Employee{
   private  int id;
     private int age;

     public void set(int id ,int age){
        this.id = id;
        this.age = age;
     } 
     public void get(){
      System.out.println("id is " + id +" age is " + age);
     }
    void show(){
     get();
    }
}

public class kajal {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.set(10,29 );
        e.show();
    }
    
}
