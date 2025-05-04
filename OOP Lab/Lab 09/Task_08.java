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
        System.out.println("You have to pay Rs." + BASE_FARE * distance + " for the Economy ride.");
    }

    @Override
    public String getRideType() {
        return "You are using Economy Ride";
    }

    @Override
    public void paymentMode() {
        System.out.println("Payment can be made via debit card only for the Economy ride.");
    }
}

class BusinessRide implements RideService {
    private double distance;

    BusinessRide (double distance) {
        this.distance = distance;
    }

    @Override
    public void calculateFare() {
        System.out.println("You have to pay Rs." + BASE_FARE * distance + " for the Business ride.");
    }

    @Override
    public String getRideType() {
        return "You are using Business Ride";
    }

    @Override
    public void paymentMode() {
        System.out.println("Payment can be made via cash or debit card for the Business ride.");
    }
}

class BikeRide implements RideService {
    private double distance;

    BikeRide(double distance) {
        this.distance = distance;
    }

    @Override
    public void calculateFare() {
        System.out.println("You have to pay Rs." + BASE_FARE * distance + " for the Bike ride.");
    }

    @Override
    public String getRideType() {
        return "You are using Bike Ride";
    }

    @Override
    public void paymentMode() {
        System.out.println("Payment can be made via cash only for the Bike ride.");
    }
}

public class Task_08 {
    public static void main(String[] args) {

        RideService economyRide = new EconomyRide(120);
        RideService businessRide = new BusinessRide(80);
        RideService bikeRide = new BikeRide(30);

        RideService[] rideServices = {economyRide, businessRide, bikeRide};

        for(RideService rideService : rideServices) {
            System.out.println();
            System.out.println(rideService.getRideType());
            rideService.calculateFare();
            rideService.paymentMode();
        }
    }
}