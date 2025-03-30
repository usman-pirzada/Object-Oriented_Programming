package Q_03;

import java.util.Scanner;

class ControlPanel {

    static void command(Vehicle vehicle, String work, int packageID) {
        command(vehicle, work, packageID, false);
    }

    static void command(Vehicle vehicle, String work, int packageID, boolean urgencyLevel) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance of destination: ");
        double distance = sc.nextDouble();

        if(vehicle instanceof RamzanDrone ramzanDrone) {
            if(urgencyLevel) {
                // A RamzanDrone interprets “urgent” as activating high-speed mode to ensure an iftar meal arrives on time.
            }

            vehicle.cal_delivery_time(distance, ramzanDrone.getMaxSpeed());
            ramzanDrone.movement();

        } else if(vehicle instanceof RamzanTimeShip ramzanTimeShip) {   // A RamzanTimeShip treats “urgent” packages as historically sensitive, requiring validationbefore transport.
            if(urgencyLevel) {
                ramzanTimeShip.verifyHistoricalConsistency();
            }

            vehicle.cal_delivery_time(distance, ramzanTimeShip.getMaxSpeed());
            ramzanTimeShip.movement();

        } else if(vehicle instanceof RamzanHyperPod) {
            if(urgencyLevel) {    
            }

            vehicle.cal_delivery_time(distance, ((RamzanHyperPod) vehicle).getMaxSpeed());
            ((RamzanHyperPod) vehicle).movement();
        }
        
        // vehicle.movement();

    }
}
