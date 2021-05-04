import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    private Books book;

    @Before
    public void setUp() {
        book = new Books("Lord Of The Rings", "Tolkien", "Fiction");

    }

    @Test
    public void hasTitle(){
        assertEquals("Lord Of The Rings", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Tolkien", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fiction", book.getGenre());
    }

}
