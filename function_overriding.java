class Plane{
    void fly(){
        System.out.println("The plane is flying");
    }
}
class cargoplane extends Plane{
    void fly(){
        System.out.println("crgo is flying");
    }
    void takeoff(){
        System.out.println("cargo is taking off");
    }
}
class Fighterplane extends cargoplane{
    void fly(){
        System.out.println("Fighter plane  is flying");
    }
}


public class function_overriding {
    public static void main(String[] args) {
        cargoplane c = new cargoplane();
        Fighterplane fp = new Fighterplane();
        // fp.fly();
        // fp.takeoff();
        // c.fly();
        Plane ref;
        ref = c;
        ref.fly();
        ref = fp ;
        ref.fly();

    }
}
