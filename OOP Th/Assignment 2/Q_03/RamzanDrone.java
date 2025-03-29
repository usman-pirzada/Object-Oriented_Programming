package Q_03;

class RamzanDrone extends Vehicle { // Small, fast, and airborne, designed for iftar meal deliveries
    private int maxSpeed;   // in Km/hr

    void cal_fast_aerial_route(double distance) {
        double deliveryTime = cal_delivery_time(distance, this.maxSpeed);
        System.out.printf("Your parcel will be delivered within %d hours via Air Route. \n", deliveryTime);
    }

    @Override
    void movement(double distance) {
        cal_fast_aerial_route(distance);
    }
}