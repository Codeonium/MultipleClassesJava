import java.awt.print.Book;
import java.util.ArrayList;

public class Borrower {

    private ArrayList<Books> book;

    public Borrower(){
        this.book = new ArrayList<Books>();
    }

    public void addBook(Books book) {
        this.book.add(book);
    }

    public int bookCount() {
        return this.book.size();
    }

    public Books removeBook() {
        return this.book.remove(0);
    }

}
