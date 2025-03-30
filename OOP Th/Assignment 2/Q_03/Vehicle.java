package Q_03;

public class Vehicle {
    private int id;
    private static int activeDeliveries = 0;

    Vehicle(int id) {
        this.id = id;
        activeDeliveries++; // todo:
    }

    public int getId() {
        return id;
    }

    public static int getActiveDeliveries() {
        return activeDeliveries;
    }

    // public static void increaseActiveDeliveries() {
    //     activeDeliveries++;
    // }
    
    // void cal_optimal_route() {

    // }

    double cal_delivery_time(double distance, int speed) {
        return distance/speed;
    }

    void movement() {
        System.out.println("\nPackage Delivered successfully!!");
    }
}