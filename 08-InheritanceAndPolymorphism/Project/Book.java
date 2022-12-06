public class Book {

    // Book attributes
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Get and set methods
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    // Display method
    public String display() {
        return "------------\nTitle: " + this.title + "\nAuthor: " + this.author + "\n";
    }

}