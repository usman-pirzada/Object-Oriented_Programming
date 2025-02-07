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
        return "\nBook Title: \"" + title + "\"\nAuthor Name: " + author + "\nPrice: " + price;
    }

    // Methods
    public void setTitle(String title) {

    }

    public void setAuthor(String author) {

    }

    public void setPrice(double price) {

    }

//    public double getTitle() {
//
//    }
//
//    public double getAuthor() {
//
//    }
}