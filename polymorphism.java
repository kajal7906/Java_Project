
class Printer 
{
void print(int a){
    System.out.println(a);
}
void print(String n){
    System.out.println(n);
}
}
public class polymorphism {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(4);
        p.print("kajal");
    }
   
}

