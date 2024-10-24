
import java.util.ArrayList;

class Book {
    private int bookid;
    private String bookname;
    private String authorname;

    public Book(int bookid, String bookname, String authorname) {
        super();
        this.bookid = bookid;
        this.bookname = bookname;
        this.authorname = authorname;
    }

    public String toString() // override
    {
        return "Book[bookid =" + bookid + ", bookname= " + bookname + ", authorname= " + authorname + "]";
    }
}

public class oct {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book(101, "let us c", "Yahswant p"));
        books.add(new Book(102, "head first java", "kathy"));

        System.out.println("All books are: ");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
