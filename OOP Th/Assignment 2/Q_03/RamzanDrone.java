package Q_03;

class RamzanDrone extends Vehicle { // Small, fast, and airborne, designed for iftar meal deliveries
    private int maxSpeed;   // in Km/hr (Flying speed)
    private double maxWeight;  // Max. weight in kg that it can handle

    RamzanDrone(int id, int maxSpeed, double maxWeight) {
        super(id);
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // void cal_fast_aerial_route(double distance) {
    //     double deliveryTime = cal_delivery_time(distance, this.maxSpeed);
    //     System.out.printf("Your parcel will be delivered within %d hours via Air Route. \n", deliveryTime);
    // }

    @Override
    void movement(int packageID/*double distance*/) {
        // cal_fast_aerial_route(distance);

        super.movement(packageID);
        System.out.println("\tDetails:");
        System.out.println("\t~~~~~~~");
        System.out.println("Package ID: " + packageID);
        System.out.print("Delivered through: \"Ramzan Drone\" [ID: " + this.getId() + "]");
        System.out.println(" (It is an aerial delivery system that specializes in delivering small iftar meals at high speed.)");
        System.out.println("-----------------------------------------");
    }
}