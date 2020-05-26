import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<BookClass> loans;

    public Borrower(String name) {
        this.name = name;
        this.loans = new ArrayList<BookClass>();
    }

    public String getName(){
        return this.name;
    }

}
