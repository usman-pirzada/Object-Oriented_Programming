package JawaSwing_BY_23K3032;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    Library(ArrayList<Book> books) {
        this.books = books;
    }

    void addBook(Book book) {
        books.add(book);
    }

    Book searchBook(String title) {
        if(books.isEmpty()) {
            return null;
        }

        for(Book b : books) {
            if(b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }

        return null;    // if searched book not found
    }

    String displayAllBooks() {
        if(books.isEmpty()) {
            return "No book available in the Library";
        }

        StringBuilder sb = new StringBuilder();

        for(Book b : books) {
            sb.append(b.displayBookInfo());
        }

        return String.valueOf(sb);
    }
}
