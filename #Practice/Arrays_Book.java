public class Arrays_Book {
    
    private String title;
    private String[] authors;
    private int index; // Index to keep track of added authors

    // Constructor
    public Arrays_Book(String title, int authorCount) {
        this.title = title;
        this.authors = new String[authorCount];
        this.index = 0; // Start at 0
    }

    // Method to add an author
    public void addAuthor(String author) {
        if (index < authors.length) {
            authors[index] = author;
            index++; // Increment index after adding
        } else {
            System.out.println("Author list is full!");
        }
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.print("Authors: ");
        for (int i = 0; i < index; i++) {
            System.out.print(authors[i]);
            if (i < index - 1) System.out.print(", ");
        }
        System.out.println();
    }

    // Main method to test the class
    public static void main(String[] args) {
        Arrays_Book book = new Arrays_Book("Java Programming", 3);
        book.addAuthor("James Gosling");
        book.addAuthor("Herbert Schildt");
        book.addAuthor("Kathy Sierra");
        book.displayBook();
        
        // Trying to add another author beyond capacity
        book.addAuthor("Another Author");
    }
}