package Q_12;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nWelcome to Book Store!");

        System.out.println("\nFollowing books have been added to store...");

        System.out.println();

        Book b1 = new Book("Java Programming", "James Gosling", 500);
        System.out.println(b1);

        Book b2 = new Book("Python Basics", "Guido van Rossum");
        System.out.println(b2);

        Book b3 = new Book("Mystery Novel");
        System.out.println(b3);
    }
}