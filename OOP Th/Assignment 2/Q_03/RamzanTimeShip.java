package Q_03;

import java.time.LocalDate;
import java.util.Scanner;

class RamzanTimeShip extends Vehicle {  // Ensures historical accuracy when delivering food to different timePeriods
    private int maxSpeed;

    RamzanTimeShip(int id, int maxSpeed) {
        super(id);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    void verifyHistoricalConsistency() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter date below at which the package should be delivered.");
        System.out.print("Enter date (DD MM YYYY): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        LocalDate inputDate = null;
        try {
            inputDate = LocalDate.of(year, month, day);
        } catch (Exception e) {
            System.out.println("Error: Invalid date entered. Please try again.");
            verifyHistoricalConsistency(); // Recursively call the method on error
            // return; // Exit the current method to avoid further execution
        }

        LocalDate currentDate = LocalDate.now();

        if (inputDate != null && inputDate.isBefore(currentDate)) {
            System.out.println("Error: The provided date (" + inputDate + ") is in the past. Please enter a valid date.");
        } else if (inputDate != null) {
            System.out.println("Success: Date validation completed!");
        }
    }

    @Override
    void movement() {
        super.movement();
        System.out.println("\tPackage Details:");
        System.out.println("Package ID: " + this.getId());
        System.out.print("Delivering Medium: \"Ramzan Time Ship\"");
        System.out.println(" (This vehicle is specialized in delivering your package at your provided time accurately.)");

        // System.out.println("Delivery Time: " + cal_delivery_time(distance, speed));
        // System.out.println("Delivery Type: " + urgencyLevel);
    }
}
