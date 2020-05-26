import java.util.ArrayList;

public class Library {

    private ArrayList<BookClass> books;

    public Library() {
        this.books = new ArrayList<BookClass>();
    }

    public int getNumberOfBooks(){
        return this.books.size();
    }

    public void addBook(BookClass book){
        this.books.add(book);
    }

}
