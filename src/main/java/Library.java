import java.util.ArrayList;

public class Library {

    private ArrayList<BookClass> books;

    public Library() {
        this.books = new ArrayList<BookClass>();
    }

    public int getNumberOfBooks(){
        return this.books.size();
    }

}
