public class Audiobook extends Book {
    // Ebook attributes
    private int minutes;
    private int seconds;

    // Constructor
    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author);

        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Get and set methods
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getDuration() {
        return Integer.toString(this.minutes) + " minutes and " + Integer.toString(this.seconds) + " seconds";
    }

    // Display method
    public String display() {
        return "------------\nTitle: " + getTitle() + "\nAuthor: " + getAuthor() + "\nDuration: " + getDuration() + "\n";
    }

}
