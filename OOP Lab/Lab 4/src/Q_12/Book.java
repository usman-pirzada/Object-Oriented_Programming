package Q_12;

public class Book {
    String title;
    String author;
    double price;

    Book(){

    }

    Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nTitle: " + title + ", Author: " + author + ", Price: " + price;
    }
}