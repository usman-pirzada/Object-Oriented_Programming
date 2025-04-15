interface RideService {
    final double BASE_FARE = 80;
    void calculateFare(double distance);
    String getRideType();
    void paymentMode();
}

class EconomyRide implements RideService {
    void calculateFare(double distance) {

    }

    String getRideType() {

    }

    void paymentMode() {

    }
}

class BusinessRide implements RideService {
    void calculateFare(double distance) {

    }

    String getRideType() {

    }

    void paymentMode() {

    }
}

public class Task_08 {
    public static void main(String[] args) {

    }
}