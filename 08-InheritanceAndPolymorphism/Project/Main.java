public class Main {
    public static void main(String[] args) {
        // Task 6
        Book b1 = new Book("Book1", "Author1");
        Book b2 = new Book("Book2", "Author2");

        System.out.println("------------Task 6:\n" + b1.display() + b2.display());

        // Task 7
        Book b3 = new Book("Book3", "Author3");

        Ebook e1 = new Ebook("Ebook1", "Author2", "File1");

        System.out.println("------------\nTask 7:\n" + b3.display() + e1.display());

        // Task 8
        Book b4 = new Book("Book4", "Author4");

        Audiobook a1 = new Audiobook("Audiobook1", "Author1", 32, 56);
        Audiobook a2 = new Audiobook("Audiobook2", "Author3", 48, 26);

        System.out.println("------------\nTask 8:\n" + b4.display() + a1.display() + a2.display());

        // Task 9
        
    }
}