public class Book {
    public String title;
    public double price;
    public String ISBN;
    public String genre;
    public String author;

    // Default Constructor
    public Book() {
        title = "Intro to java";
        price = 5280.0;
        ISBN = "A8479642S";
        genre = "Coding";
        author = "AK George";
    }

    // Parameterized Constructor
    public Book(String title, double price, String ISBN, String genre, String author) {
        this.title = title;
        this.price = price;
        this.ISBN = ISBN;
        this.genre = genre;
        this.author = author;
    }

    // Copy Constructor
    public Book(Book b) {
        this.title = b.title;
        this.price = b.price;
        this.ISBN = b.ISBN;
        this.genre = b.genre;
        this.author = b.author;
    }
}
