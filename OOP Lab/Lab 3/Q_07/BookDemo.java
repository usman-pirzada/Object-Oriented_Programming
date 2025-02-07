package Q_07;

public class BookDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to Book Library!");
        System.out.println("\nCreating a book titled \"Java: A Beginner's Guide\" with author \"Herbert Scheldt\" and price 100.95 ..........");

        Book book = new Book("Java: A Beginner's Guide", "Herbert Schelat", 100.95);

        System.out.println();
        System.out.println(book);
    }
}