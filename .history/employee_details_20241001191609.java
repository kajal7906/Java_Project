import java.util.Scanner;

import lab2.Employee;

class Employee {
    int id ;
    String name;

    private void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id");
        id = sc.nextInt();
        System.out.println("Enter the Name :");
        name = sc.next();
       
    }
    void show()
    {
        get();
    System.out.println("Employee id is " + id + " name is " + name);
    }
}
public class employee_details{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.show();
    }
}