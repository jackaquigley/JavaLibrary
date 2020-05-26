import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    BookClass book2;
    BookClass book3;
    BookClass book4;

    @Before
    public void setUp(){
        book2 = new BookClass("Brave New World", "Aldous Huxley", "Sci-fi");
        book3 = new BookClass("Battle Royale", "Koushun Takami", "Horror");
        book4 = new BookClass("Frankenstein", "Mary Shelley", "Horror");
        library = new Library(2);
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

    @Test
    public void libraryHasCapacity(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void libraryHasLimitedCapacity(){
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(2, library.getCapacity());
    }

}
