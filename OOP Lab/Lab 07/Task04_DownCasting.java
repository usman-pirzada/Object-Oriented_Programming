class Delivery {
    void calculateDeliveryTime() {
        System.out.println("Delivery Time");
    }
}

class ExpressDelivery extends Delivery {
    void calculateExpressDeliveryTime() {
        System.out.println("Express Delivery Time");
    }
}

class StandardDelivery extends Delivery {
    void calculateStandardDeliveryTime() {
        System.out.println("Standard Delivery Time");
    }
}

public class Task04_DownCasting {
    public static void main(String[] args) {
        // UpCasting
        Delivery d1 = new ExpressDelivery();
        Delivery d2 = new StandardDelivery();

        d1.calculateDeliveryTime();
        d2.calculateDeliveryTime();

        if(d1 instanceof ExpressDelivery) { // DownCasting
            ExpressDelivery d3 = (ExpressDelivery) d1;
            d3.calculateDeliveryTime();
            d3.calculateExpressDeliveryTime();
        }

        if(d2 instanceof StandardDelivery) { // DownCasting
            StandardDelivery d4 = (StandardDelivery) d2;
            d4.calculateDeliveryTime();
            d4.calculateStandardDeliveryTime();
        }
    }
}
