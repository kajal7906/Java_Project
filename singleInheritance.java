import java.util.Scanner;

class Flower{
    void color(){
        System.out.println("Flowers are of Red color");
    }
}

class Rose extends Flower{
     void color1(){
          System.out.println("Roses are red");
     }
}

public class singleInheritance {
    public static void main(String[] args) {
       
            Rose R = new Rose();
            R.color();
            R.color1();
    }
    
}
