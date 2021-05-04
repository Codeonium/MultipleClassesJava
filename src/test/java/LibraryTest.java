import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Books book;

    @Before
    public void setUp(){
        library = new Library();
        book = new Books("Lord Of The Rings", "Tolkien", "Fiction");
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }
    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.removeBook(book);
        assertEquals(2, library.bookCount());
    }
    @Test
    public void canCheckStock(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.removeBook(book);
        assertEquals(2, library.stockCount());
    }
}
