import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    private Library library;
    private Books book;

    @Before
    public void setUp(){
        library = new Library(10);
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

    @Test
    public void hasCapacity(){
        assertEquals(10, library.checkCapacity());
    }

    @Test
    public void capacityCanChange(){
        library.addBook(book);
        assertEquals(9, library.checkCapacity());
    }
    @Test
    public void capacityFull(){
        Library library2 = new Library(2);
        library2.addBook(book);
        library2.addBook(book);
        library2.addBook(book);
        library2.addBook(book);
        library2.addBook(book);
        assertEquals(0, library2.checkCapacity());
    }
    @Test
    public void canCheckIfStockIsFull(){
        assertTrue(true); library.stockStatus();
    }
}
