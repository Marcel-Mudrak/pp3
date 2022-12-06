public class Ebook extends Book {

    // Ebook attributes
    private String file_name;

    // Constructor
    public Ebook(String title, String author, String file_name) {
        super(title, author);

        this.file_name = file_name;
    }

    // Get and set methods
    public void setFileName(String file_name) {
        this.file_name = file_name;
    }

    public String getFileName() {
        return this.file_name;
    }

    // Display method
    public String display() {
        return "------------\nTitle: " + getTitle() + "\nAuthor: " + getAuthor() + "\nFile name: " + this.file_name + "\n";
    }

}
