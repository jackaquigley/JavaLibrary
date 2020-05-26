import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<BookClass> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<BookClass>();
    }

    public int getNumberOfBooks(){
        return this.books.size();
    }

    public void addBook(BookClass book){
       if ( this.books.size() < this.capacity )
       { this.books.add(book); }
    }

    public int getCapacity(){
        return this.capacity;
    }

}
