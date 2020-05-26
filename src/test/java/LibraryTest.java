import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    BookClass book2;

    @Before
    public void setUp(){
        book2 = new BookClass("Brave New World", "Aldous Huxley", "Sci-fi");
        library = new Library();
    }

    @Test
    public void libraryHasBooks() {
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void addBooks(){
        library.addBook(book2);
        assertEquals(1, library.getNumberOfBooks());
    }

}
