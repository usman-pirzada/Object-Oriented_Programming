package JavaGUI_PhySession;

import java.awt.*;
import javax.swing.*;

/*
public class Main {

    static Library lib = new Library();

    public static void main(String[] args) {
        
        /*
         * JOptionPane.INFORMATION_MESSAGE / ERROR_MESSAGE
         *//*

        JFrame frame = new JFrame("Library Management System");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l = new JLabel("Library Management System");
        l.setBounds(120, 10, 300, 30);
        l.setFont(new Font("Arial", Font.BOLD, 30));
        frame.add(l);

        JButton addBook = new JButton("Add Book");
        JButton searchBook = new JButton("Search Book");
        JButton viewBooks = new JButton("View All Books");

        frame.add(addBook);
        frame.add(searchBook);
        frame.add(viewBooks);

        addBook.addActionListener(e->addBookForm());
        searchBook.addActionListener(e->searchBookForm());
        viewBooks.addActionListener(e-> {
            JTextArea ta = new JTextArea(lib.displayBooks());
            ta.setEditable(false);

            JOptionPane.showMessageDialog(frame, "All Books", JOptionPane.INFORMATION_MESSAGE);
        });

        frame.setVisible(true);



        String[] options = {"Add books", "Search Books", "View All Books", "Exit"};

        JOptionPane.showOptionDialog(frame, "Library Management System", "Library Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    }

    public static void addBookForm() {
        JTextField titleF = new JTextField();
        JTextField authoeF = new JTextField();
        JTextField isbnF = new JTextField();
        JTextField genreF = new JTextField();
        JTextField yearF = new JTextField();

        Object[] message = {"Title", }
    }

    public static void searchBookForm() {
        
    }
}
*/



public class Main {
    private static Library library = new Library();

    public static void main(String[] args) {
        JFrame frame = new JFrame("📚 Library Management System");
        frame.setSize(500, 500);

        // Center the frame on the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("📚Library Management System📚");
        label.setBounds(120, 10, 300, 30);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(label);

        JButton addBtn = new JButton("Add Book");
        JButton searchBtn = new JButton("Search Book");
        JButton viewBtn = new JButton("View All Books");

        addBtn.setBounds(150, 60, 200, 40);
        searchBtn.setBounds(150, 120, 200, 40);
        viewBtn.setBounds(150, 180, 200, 40);

        frame.add(addBtn);
        frame.add(searchBtn);
        frame.add(viewBtn);

        addBtn.addActionListener(e -> addBookForm());
        searchBtn.addActionListener(e -> searchBookForm());
        viewBtn.addActionListener(e -> {
            JTextArea ta = new JTextArea(library.displayBooks());
            ta.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(ta);
            scrollPane.setPreferredSize(new Dimension(400, 300));
            JOptionPane.showMessageDialog(frame, scrollPane, "📚 All Books", JOptionPane.INFORMATION_MESSAGE);
        });

        frame.setVisible(true);
    }

    private static void addBookForm() {
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField isbnField = new JTextField();
        JTextField genreField = new JTextField();
        JTextField yearField = new JTextField();

        Object[] message = {     "Title:", titleField,     "Author:", authorField,   "ISBN:", isbnField,
            "Genre:", genreField,
            "Publication Year:", yearField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "➕ Add New Book", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try {
                String title = titleField.getText();
                String author = authorField.getText();
                String isbn = isbnField.getText();
                String genre = genreField.getText();
                int year = Integer.parseInt(yearField.getText());

                Book book = new Book(title, author, isbn, genre, year);
                library.addBook(book);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input for year!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void searchBookForm() {
        String title = JOptionPane.showInputDialog("Enter the book title to search:");
        if (title != null && !title.isEmpty()) {
            Book found = library.searchBook(title);
            if (found != null) {
                JOptionPane.showMessageDialog(null, found.toString(), "🔍 Book Found", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Book not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}