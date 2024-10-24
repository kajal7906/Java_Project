import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student1 {
    int id;
    String name;

    public Student1(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String toString(){
        // return "student1"["id =" + id + " name  = "+  name  ]
        return "hey";
    }
}

class CompareId implements Comparator<Student1> {
    public int compare(Student1 a1, Student1 a2) {
        return a1.id - a2.id;
    }

}

class CompareName implements Comparator<Student1> {
    public int compare(Student1 a1, Student1 a2) {
        return a1.name.compareTo(a2.name); // for value match we have used compareTo here
    }

}

public class comparator {
    public static void main(String[] args) {
        ArrayList<Student1> al = new ArrayList<Student1>();
        al.add(new Student1(101, "kajal"));
        al.add(new Student1(103, "neetu"));
        al.add(new Student1(109, "parnita"));
        al.add(new Student1(104, "amayra"));
        al.add(new Student1(100, "buggu"));

        Collections.sort(al, new CompareName());
        for (int i = 0; i < al.size(); i++)
            System.out.println(al.get(i));
        Collections.sort(al, new CompareId());
        for (int i = 0; i < al.size(); i++)
            System.out.println(al.get(i));

    }
}
