import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void display() {
        for (int b = 0; b >= books.size(); b++) {
            books.get(b).display();
        }
    }
}
