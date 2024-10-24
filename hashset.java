import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet <String> ();
        hs.add("kajal");
        hs.add("Neetu");
        hs.add("parnita");
        hs.add("khushi");
        hs.add("priyanshu");
        hs.add("kajal");
        hs.add(null);
        System.out.println(hs);
    }
    
}
