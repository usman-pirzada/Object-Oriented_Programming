package Q_03;

public class RamzanBox_AI_System {
    public static void main(String[] args) {
        Vehicle ts = new RamzanTimeShip(55, 120);
        Vehicle drone = new RamzanDrone(101, 80, 5.0);
        Vehicle hyperPod = new RamzanHyperPod(202, 150, 100.0);

        // ControlPanel cp = new ControlPanel();

        // cp.command(ts, "Deliver", 265); // static function in a non-static class can also be accessed by the object of the class instead of class name
        
        ControlPanel.command(ts, "Deliver", 987);
        ControlPanel.command(drone, "Deliver", 123, true);
        ControlPanel.command(hyperPod, "Deliver", 456);
    }
}
