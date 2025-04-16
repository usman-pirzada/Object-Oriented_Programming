package JawaSwing_BY_23K3032;

import javax.swing.*;

public class LibraryManagement {
    public static void main(String[] args) {

        Library lib = new Library();

        String[] options = {"Add books", "Search Books", "View All Books", "Exit"};
        
        JOptionPane.showOptionDialog(null, "Library Management System", "Library Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        
    }
}