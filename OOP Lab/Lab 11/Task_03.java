import java.util.ArrayList;
import java.util.List;

class Warehouse<T> {
    private List<T> items;

    Warehouse() {
        this.items = new ArrayList<>();
    }

    void addItem(T item) {
        this.items.add(item);
    }

    T getItem(int index) {
        return this.items.get(index);
    }

    int getSize() {
        return this.items.size();
    }
}

class Task_03 {
    public static void main(String[] args) {
        
        Warehouse<String> electronics = new Warehouse<>();
        electronics.addItem("Laptop");
        electronics.addItem("Mobile");
        electronics.addItem("Tablet");


        Warehouse<Integer> quatities = new Warehouse<>();
        quatities.addItem(50);
        quatities.addItem(20);
        quatities.addItem(35);

        System.out.println();
        System.out.println("**** Warehouse Inevntory *****");
        System.out.println("Items\t Quantity");
        for (int i = 0; i < electronics.getSize(); i++) {
            System.out.println(electronics.getItem(i) + "   " + quatities.getItem(i));
        }
    }
}
