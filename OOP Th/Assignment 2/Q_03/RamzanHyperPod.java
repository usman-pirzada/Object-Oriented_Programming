package Q_03;

class RamzanHyperPod extends Vehicle { // High-speed underground transport optimized for bulk food deliveries.
    private int maxSpeed;   // in Km/hr (Ground speed)
    private double maxWeight;   // Max. weight in kg that it can lift

    RamzanHyperPod(int id, int maxSpeed, double maxWeight) {
        super(id);
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    void movement() {
        // navigate in underground tunnel

        super.movement();
        System.out.println("\tPackage Details:");
        System.out.println("Package ID: " + this.getId());
        System.out.print("Delivered through: \"Ramzan Hyper Pod\"");
        System.out.println(" (It is a ground-based high-speed transport system optimized for bulk deliveries.)");
    }
}
