interface RideService {
    final double BASE_FARE = 80;

    void calculateFare();
    String getRideType();
    void paymentMode();
}

class EconomyRide implements RideService {
    private double distance;

    EconomyRide(double distance) {
        this.distance = distance;
    }

    @Override
    public void calculateFare() {

    }

    @Override
    public String getRideType() {
        return null;
    }

    @Override
    public void paymentMode() {

    }
}

class BusinessRide implements RideService {
    private double distance;

    BusinessRide (double distance) {
        this.distance = distance;
    }

    @Override
    public void calculateFare() {

    }

    @Override
    public String getRideType() {
        return null;
    }

    @Override
    public void paymentMode() {

    }
}

class BikeRide implements RideService {
    private double distance;

    BikeRide(double distance) {
        this.distance = distance;
    }

    @Override
    public void calculateFare() {

    }

    @Override
    public String getRideType() {
        return null;
    }

    @Override
    public void paymentMode() {

    }
}

public class Task_08 {
    public static void main(String[] args) {

        RideService economyRide = new EconomyRide(120);
        RideService businessRide = new BusinessRide(80);
        RideService bikeRide = new BikeRide(30);

        RideService[] rideServices = {economyRide, businessRide, bikeRide};

        for(RideService rideService : rideServices) {
            rideService.getRideType();
            rideService.calculateFare();
            rideService.paymentMode();
        }
    }
}