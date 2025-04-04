package Q_03;

public class RamzanBox_AI_System {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new RamzanTimeShip(55, 120);
        vehicles[1] = new RamzanDrone(101, 80, 5.0);
        vehicles[2] = new RamzanHyperPod(202, 150, 100.0);


        // Array of vehicles is passed to the command method, where AI decision-making system will decide the vehicle to choose for delivery.
        System.out.println("******Urgent Delivery******");
        System.out.println("\tDelivery-01");
        ControlPanel.command(vehicles, "Deliver", 123, true);

        System.out.println("\n******Non-urgent Deliveries******");
        System.out.println("\tDelivery-02");
        ControlPanel.command(vehicles, "Deliver", 654, false);
        
        System.out.println("\n\tDelivery-03");
        ControlPanel.command(vehicles, "Deliver", 987);

    }
}
