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
class hibiscus  extends Rose{
    void color2(){
         System.out.println("Hibiscus are red");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
       
            Rose R = new Rose();
            hibiscus h = new hibiscus();
            R.color();
            R.color1();
            h.color1();
            h.color2();
    }
    
}
