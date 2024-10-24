class emp {
    int id;
    String name;

    public emp(int id, String name) {
        super();
        this.id = id;
        this.name = name;

    }

    public String toString() {
        return "eid=" + id + ", name=" + name;
    }
}

public class tostring {
    public static void main(String[] args) {
        emp e = new emp(1, "kajal");
        System.out.println(e);
    }
}
