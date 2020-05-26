import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;

    @Before
    public void setup(){
        borrower = new Borrower("Jack");
    }

    @Test
    public void borrowerHasName() {
        assertEquals("Jack", borrower.getName());
    }

}
