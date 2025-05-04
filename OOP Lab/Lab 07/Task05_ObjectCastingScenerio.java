class Product {
    String name;
    double price;

    void showDetails() {
        // prints a generic product description
        System.out.println("Product Name: " + this.name);
        System.out.printf("Price: %.2f\n", this.price);
    }
}

class Electronics extends Product {
    private int warrantyPeriod;

    void showDetails() {
        super.showDetails();
        System.out.println("Category: Electronic Item");
        System.out.println();
    }

    void applyWarranty(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}

class Clothing extends Product {
    private double discountedPrice;

    void showDetails() {
        super.showDetails();
        if(this.discountedPrice >= 0) System.out.printf("Discounted Price: %.2f%n", discountedPrice);
        System.out.println("Category: Clothing");
        System.out.println();
    }

    void applyDiscount(float discountPercent) {
        if(discountPercent > 0) {
            discountedPrice = price * (1 - (discountPercent / 100));
        } else {
            System.out.println("Unable to apply discount due to invalid input!!");
        }
    }
}

public class Task05_ObjectCastingScenerio {
    public static void main(String[] args) {

        Product e = new Electronics();
        Product c = new Clothing();

        e.name = "Type-C Charger";
        e.price = 450;

        c.name = "School Unoform";
        c.price = 2000;

        if(e instanceof Electronics) {
            ((Electronics) e).applyWarranty(24);
        }

        if(c instanceof Clothing) {
            ((Clothing) c).applyDiscount(20);
        }


        e.showDetails();
        c.showDetails();

    }
}
