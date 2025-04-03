package Q_03;

class RamzanHyperPod extends Vehicle { // High-speed underground transport optimized for bulk food deliveries.
    private int maxSpeed = 120;   // in Km/hr (Ground speed)
    private double maxWeight = 100;   // Max. weight in kg that it can lift
    private double distanceToCover;

    RamzanHyperPod(int id, int maxSpeed, double maxWeight) {
        super(id);
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getDistanceToCover() {
        return distanceToCover;
    }

    public void setDistanceToCover(double distanceToCover) {
        this.distanceToCover = distanceToCover;
    }
    
    @Override
    void movement(int packageID) {
        // navigate in underground tunnel

        double deliveryTime = this.cal_delivery_time(distanceToCover, this.getMaxSpeed());

        // super.movement(packageID);

        System.out.println("\tDetails:");
        System.out.println("\t~~~~~~~");
        System.out.println("Package ID: " + packageID);
        System.out.print("Delivered through: \"Ramzan Hyper Pod\" [ID: " + this.getId() + "]");
        System.out.println(" (It is a ground-based high-speed transport system optimized for bulk deliveries.)");
        System.out.println("-----------------------------------------");
    }

    public double getMaxWeight() {
        return maxWeight;
    }
}
