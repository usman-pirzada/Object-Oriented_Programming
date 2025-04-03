package Q_03;

import java.util.Scanner;

class ControlPanel {

    static void command(Vehicle[] vehicles, String work, int packageID) {
        command(vehicles, work, packageID, false);
    }

    static void command(Vehicle[] vehicles, String work, int packageID, boolean urgencyLevel) {
        Scanner sc = new Scanner(System.in);

        Vehicle vehicle = DecisionMaking.decisionMakingSystem(vehicles, urgencyLevel); // todo: see whether distance needed in it

        System.out.print("Enter destination distance (in km): ");

        if(vehicle instanceof RamzanDrone ramzanDrone) {
            ramzanDrone.setDistanceToCover(sc.nextDouble());

            if(urgencyLevel) {
                // A RamzanDrone interprets “urgent” as activating high-speed mode to ensure an iftar meal arrives on time.
                System.out.println("Your Iftar meal has been \"urgently\" delivered via Ramzan Drone by activating \"high-speed mode\".");
            } else {
                System.out.println("Your package will be delivered via Ramzan Drone.");
            }

            ramzanDrone.movement(packageID);

        } else if(vehicle instanceof RamzanTimeShip ramzanTimeShip) {   // A RamzanTimeShip treats “urgent” packages as historically sensitive, requiring validationbefore transport.
            ramzanTimeShip.setDistanceToCover(sc.nextDouble());

            if(urgencyLevel) {
                System.out.println("As your package is marked as urgent, we need to validate historical consistency.");
                ramzanTimeShip.verifyHistoricalConsistency();
            } else {
                System.out.println("Your package will be delivered via Ramzan Time Ship.");
            }

            ramzanTimeShip.movement(packageID);

        } else if(vehicle instanceof RamzanHyperPod) {
            ((RamzanHyperPod) vehicle).setDistanceToCover(sc.nextDouble());

            if(urgencyLevel) {
                System.out.println("Your package will be \"urgently\" delivered via Ramzan Hyper Pod.");
            } else {
                System.out.println("Your package will be delivered via Ramzan Hyper Pod.");
            }

            ((RamzanHyperPod) vehicle).movement(packageID);
        }

    }
}