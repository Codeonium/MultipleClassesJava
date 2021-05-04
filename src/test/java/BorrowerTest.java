import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Books book;

    @Before
    public void setUp(){
        borrower = new Borrower();
        book = new Books("Lord Of The Rings", "Tolkien", "Fiction");
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canGetBook(){
        borrower.addBook(book);
        borrower.removeBook();
        assertEquals(0, borrower.bookCount());
    }

}
