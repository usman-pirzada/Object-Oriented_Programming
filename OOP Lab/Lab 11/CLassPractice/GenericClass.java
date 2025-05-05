package CLassPractice;

import java.awt.print.Book;

class Box<B> {
    private B item;

    public void addItem(B item) {
        this.item = item;
    }

    public B getItem() {
        return item;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Box<String> bookBox = new Box<>();
        bookBox.addItem("Data Structures by Mujtaba");

        Box<Integer> toyBox = new Box<>();
        toyBox.addItem(12345);

        System.out.println("Book: " + bookBox.getItem());
        System.out.println("Toy ID: " + toyBox.getItem());
    }
}
