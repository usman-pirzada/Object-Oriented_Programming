package Q_03;

public class ShoppingCard {
    String productName;
    double price;
    int quantity;

    public String toString() {
        return " Product: " + productName + "\n Price: " + price + "\n Quantity: " + quantity;
    }

    ShoppingCard() {
        this.productName = "Generic";
        this.price = 0.0;
        this.quantity = 1;

        System.out.println("\nDefault Product Added:");
        System.out.println(this);
    }

    ShoppingCard(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

        System.out.println("\nNew Product Added:");
        System.out.println(this);
    }

    @Override
    protected void finalize() {
        System.out.println("\nProduct removed from card: " + this.productName);
    }
}