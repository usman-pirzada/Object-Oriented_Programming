package Q_12;

public class Book {
    String title;
    String author;
    double price;

    // Parameterized Constructors
    Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book Title: " + title + ", Author: " + author + ", Price: $" + price;
    }
}