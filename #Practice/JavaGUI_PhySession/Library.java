package JavaGUI_PhySession;

import java.util.ArrayList;

class Library {
    ArrayList<Book> books;

    Library() {
        this.books = new ArrayList<>();
    }

    Library(ArrayList<Book> books) {
        this.books = books;
    }
}


/*


class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        JOptionPane.showMessageDialog(null, "Book added successfully!");
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) return book;
        }
        return null;
    }

    public String displayBooks() {
        if (books.isEmpty()) return "No books in the library.";
        StringBuilder sb = new StringBuilder();
        for (Book book : books) sb.append(book.toString());
        return sb.toString();
    }
}



 */