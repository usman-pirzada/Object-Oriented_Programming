package Practice_1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Book> books = List.of(
            new Book("Java OOP", "Sir Minhal"),
            new Book("Java Swing", "Sir Nadeem")
        );

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Books.dat"))) {
            oos.writeObject(books);

        } catch (Exception e) {
            e.printStackTrace();
        }
        

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Books.dat"))) {
            List<Book> books1 = (List<Book>) ois.readObject();

            for (Book b : books1) {
                System.out.println(" -" + b.name + " (Author: " + b.author + ")");
            }

        } catch (Exception e) {

        }
    }        
}


class Book implements Serializable {
    String name;
    String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        System.out.println("Data of \"" + name + "\" Book saved successfully!");
    }

    private void readObject(ObjectInputStream ois) throws Exception {
        ois.defaultReadObject();
        System.out.println("Data of \"" + name + "\" read successfully!");
    }
}