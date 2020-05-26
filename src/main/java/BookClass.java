public class BookClass {

    private String title;
    private String author;
    private String genre;

    public BookClass(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle(){
        return this.title;
    }
}
