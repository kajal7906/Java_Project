
abstract class Abst{

//  void show()
//  {

//     System.out.println("Non abstract method");
//  }

 abstract void show1();
}

abstract class Abst1 extends Abst{
    void show1(){
        System.out.println("Abstract Method");
    }
}
class Abst2 extends Abst1{
    void show1 (){
        System.out.println("Abstract Method");
    }
}

public class abstraction {

    public static void main(String[] args) {
        // Abst a = new Abst();  //cannot create obj of abstraction class
        Abst2 ab = new Abst2();
        // ab.show();
        ab.show1();
            
        }
        
    }

