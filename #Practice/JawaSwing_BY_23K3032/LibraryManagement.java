package JawaSwing_BY_23K3032;

import javax.swing.*;

public abstract  class LibraryManagement {
    public static void main(String[] args) {

        Library library = new Library();

        while(true) {
            String[] options = {"Add books", "Search Books", "View All Books", "Exit"};
            
            int choice = JOptionPane.showOptionDialog(null, "Library Management System", "Library Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch(choice) {
                case 0: // Add Book
                    String title = JOptionPane.showInputDialog("Enter book title:");
                    String author = JOptionPane.showInputDialog("Enter author name:");
                    String isbn = JOptionPane.showInputDialog("Enter ISBN:");

                    Book book = new Book(title, author, isbn);

                    if(title != null && author != null && isbn != null && !title.isBlank() && !author.isBlank() && !isbn.isBlank()) {
                        library.addBook(book);
                        JOptionPane.showMessageDialog(null, "Book Added Successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Unable to add book! (No input should be empty)", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 1: // Search Book
                    String titleToSearch = JOptionPane.showInputDialog("Enter complete book's title to search:");

                    Book foundBook = library.searchBook(titleToSearch);
                    if(foundBook != null) {
                        JOptionPane.showMessageDialog(null, "Book Found\n" + foundBook.displayBookInfo());
                    } else {
                        JOptionPane.showMessageDialog(null, "Book NOT Found!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 2: // View All Books
                    JOptionPane.showMessageDialog(null, library.displayAllBooks());
                    break;

                case 3: // Exit
                    int option = JOptionPane.showConfirmDialog(null, "Do you want to EXIT?", "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.CANCEL_OPTION);
                    if(option == 0) {
                        System.exit(0);
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice! Try Again");
            }   
        }

    }
}