import java.util.Scanner;

class User {
    int id;
    String name;

    User(int a, String b) {
        id = a;
        name = b;
    }
}

class Employee extends User {
    double salary;

    Employee(int id, String name, double sal) {
        super(id, name);
        salary = sal;
    }

    void calculateAnnualSalary() {
        double AnnualSalary = salary * 12;

        System.out.println("id is " + id + "  name is " + name + " Annual salary is: " + AnnualSalary);
    }

}

public class inherit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int sal = sc.nextInt();
        Employee e = new Employee(101, "kajal", sal);
        e.calculateAnnualSalary();

    }
}
