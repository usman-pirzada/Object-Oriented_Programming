package CLassPractice;

// (a) Generic Class
class Inventory<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

// (b) Generic Method
class Printer {
    public static <T> void printItemDetails(T item) {
        System.out.println("Item Details: " + item);
    }
}

// (c) Generic Interface & Implementation
interface Storable<T> {
    void addItem(T item);
    T removeItem();
}

class InventoryManager<T> implements Storable<T> {
    private T item;

    @Override
    public void addItem(T item) {

    }

    @Override
    public T removeItem() {
        T temp = this.item;
        this.item = null;
        System.out.println("Item Removed Successfully!");
        return temp;
    }
}

public class IMS_by_GenericClass {
    public static void main(String[] args) {

    }
}