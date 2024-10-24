
 import java.util.*;

class HillStations { // superclass

    void location() {
        System.out.println("Hillstaions are present in various states.....");

    }

    void famousfor() {
        System.out.println("HillStations are famous for their beauty");
    }

}

// subclasses
class Manali extends HillStations {
    void location() {
        System.out.println("Manali is located in Himanchal Pradesh");

    }

    void famousfor() {
        System.out.println("Manali is famous for waterfalls and valleys");
    }

}

class Mussoorie extends HillStations {
    void location() {
        System.out.println("Mussorrie is located in Dehradun");

    }

    void famousfor() {
        System.out.println("Mussoorie is famous for its green hills and flaura and fauna");
    }

}

class Gulmarg extends HillStations {
    void location() {
        System.out.println("Gulmarg is in J&k");

    }

    void famousfor() {
        System.out.println("Gulmarg is famous for its flowers and skiing");
    }

}

public class hillexamp {
    public static void main(String[] args) {
        HillStations hl = new HillStations();
        hl.location();
        hl.famousfor();

        Manali ml = new Manali();
        ml.location();
        ml.famousfor();

        Mussoorie ms = new Mussoorie();
        ms.location();
        ms.famousfor();

        Gulmarg gm = new Gulmarg();
        gm.location();
        gm.famousfor();
    }

}

