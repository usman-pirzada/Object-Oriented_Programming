abstract class UberRide {
    int rideId;
    double distance;
    double baseFare;

    UberRide(double baseFare, double distance, int rideId) {
        this.rideId = rideId;
        this.distance = distance;
        this.baseFare = baseFare;
    }

    abstract double calculateFare();
    abstract void dispatchDriver();

    void printReceipt() {
        System.out.println("-----------------------");
        System.out.println("Ride ID: " + rideId);
        System.out.println("Distance: " + distance + "km");
        System.out.println("Base Fare: Rs." + baseFare);
        System.out.println("Total Fare: Rs." + calculateFare());
        System.out.println("-----------------------");
    }
}

class UberX extends UberRide {

    UberX(double baseFare, double distance, int rideId) {
        super(baseFare, distance, rideId);
    }

    double calculateFare() {
        return baseFare + (distance * 20.32);
    }

    void dispatchDriver() {
        System.out.println("Disptching the driver of Uber-X");
    }
}

class UberBlack extends UberRide {

    UberBlack(double baseFare, double distance, int rideId) {
        super(baseFare, distance, rideId);
    }

    double calculateFare() {
        return baseFare + (distance * 34.56);
    }

    void dispatchDriver() {
        System.out.println("Disptching the driver of Uber Black");
    }
}

class UberXL extends UberRide {

    UberXL(double baseFare, double distance, int rideId) {
        super(baseFare, distance, rideId);
    }

    double calculateFare() {
        return baseFare + (distance * 30);
    }

    void dispatchDriver() {
        System.out.println("Disptching the driver of Uber-XL");
    }
}

class RideAnalytics {
    static String rideCategory;

    static void analyzeRide(UberRide ride) {
        if(ride instanceof UberX) {
            rideCategory = "Uber-X";
        } else if(ride instanceof UberBlack) {
            rideCategory = "Uber Black";
        } else if(ride instanceof UberXL) {
            rideCategory = "Uber-XL";
        } else {
            System.out.println("\nUNKNOWN Ride");
            return;
        }

        System.out.println("--------------------");
        System.out.println("Ride Category: " + rideCategory + "\nFare: " + ride.calculateFare());
        System.out.println("--------------------");
    }
}

public class Task_09 {
    public static void main(String[] args) {
        
        UberX uberX = new UberX(80, 20, 687645);
        UberBlack uberBlack = new UberBlack(70, 9, 32146);
        UberXL uberXL = new UberXL(100, 35, 15633);

        // Dispatch Driver
        System.out.println("\nDispatching Drivers:");
        uberX.dispatchDriver();
        uberBlack.dispatchDriver();
        uberXL.dispatchDriver();

        // Analyze each ride type and print the results
        System.out.println("\nAnalyzing rides:");
        RideAnalytics.analyzeRide(uberX);
        RideAnalytics.analyzeRide(uberBlack);
        RideAnalytics.analyzeRide(uberXL);

        // Printing Receipt
        System.out.println("\nPrinting Receipts:");
        uberX.printReceipt();
        uberBlack.printReceipt();
        uberXL.printReceipt();
    }
}