import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    BookClass book;

    @Before
    public void setUp() {
        book = new BookClass("The Handmaid's Tale", "Margaret Atwood","Speculative Fiction");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("The Handmaid's Tale", book.getTitle());
    }

}
