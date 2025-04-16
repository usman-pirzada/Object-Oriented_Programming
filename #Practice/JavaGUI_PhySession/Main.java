package JavaGUI_PhySession;

import java.awt.*;
import javax.swing.*;

public class Main {

    static Library lib = new Library();

    public static void main(String[] args) {
        
        /*
         * JOptionPane.INFORMATION_MESSAGE / ERROR_MESSAGE
         */

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