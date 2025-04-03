package Q_03;

public class RamzanBox_AI_System {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new RamzanTimeShip(55, 120);
        vehicles[1] = new RamzanDrone(101, 80, 5.0);
        vehicles[2] = new RamzanHyperPod(202, 150, 100.0);


        // Array of vehicles is passed to the command method, where AI decision-making system will decide the vehicle to choose for delivery.
        ControlPanel.command(vehicles, "Deliver", 987);
        ControlPanel.command(vehicles, "Deliver", 654, true);
        ControlPanel.command(vehicles, "Deliver", 123, true);
        ControlPanel.command(vehicles, "Deliver", 456);


        /*
         * It shows that static function in a non-static class can also be accessed by the object of the class instead of class name
         */
        // ControlPanel cp = new ControlPanel();
        // cp.command(ts, "Deliver", 265);
    }
}
