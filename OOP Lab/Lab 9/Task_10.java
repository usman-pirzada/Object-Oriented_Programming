
interface OrderPolicy {
    void acceptOrder();
    void calculatePreparationTime();

    static void commonGuidelines() {
        System.out.println("These are the guidlines for Order policy.");
    }
}

interface DeliveryPolicy {
    void assignRider();
    void calculateDeliveryCharge();
}

class RestaurantPartner implements OrderPolicy, DeliveryPolicy {

    @Override
    public void acceptOrder() {
        System.out.println("Order accepted by Restaurant Partner");
    }

    @Override
    public void calculatePreparationTime() {
        System.out.println("Restaurant Partner is calculating preparation time for your order");
    }

    @Override
    public void assignRider() {
        System.out.println("Restaurant Partner is assigning a rider for your order.");
    }

    @Override
    public void calculateDeliveryCharge() {
        System.out.println("Delivery Charges: Rs.250/-");
    }
}

class ExpressDeliveryPartner implements DeliveryPolicy {
    @Override
    public void assignRider() {
        System.out.println("Express Delivery Partner is assigning a rider for your order.");
    }

    @Override
    public void calculateDeliveryCharge() {
        System.out.println("Express Delivery Charges: Rs.320/-");
    }
}

public class Task_10 {
    public static void main(String[] args) {

        OrderPolicy.commonGuidelines();
        
        OrderPolicy orderPolicy = new RestaurantPartner();
        DeliveryPolicy deliveryPolicy = new ExpressDeliveryPartner();

        orderPolicy.acceptOrder();
        orderPolicy.calculatePreparationTime();

        deliveryPolicy.assignRider();
        deliveryPolicy.calculateDeliveryCharge();

        // Polymorphism Demonstration
        DeliveryPolicy[] deliveryPartners = new DeliveryPolicy[2];
        deliveryPartners[0] = (DeliveryPolicy) orderPolicy;
        deliveryPartners[1] = deliveryPolicy;

        for(DeliveryPolicy dp : deliveryPartners) {
            System.out.println();
            dp.assignRider();
            dp.calculateDeliveryCharge();
        }
    }
}