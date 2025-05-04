package Q_07;

public class Book {
    String title;
    String author;
    double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nBook Title: " + title + "\nAuthor Name: " + author + "\nPrice: " + price;
    }

    // Getters
    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    double getPrice() {
        return this.price;
    }
}