package Q_03;

public class AI_conflictResolution {

    /**
     * Conflict resolution method that decides between two vehicles which have equal delivery times.
     * The vehicle with the higher margin/capacity (maxWeight - packageWeight) is preferred.
     */
    public static Vehicle resolveConflict(Vehicle v1, Vehicle v2, double packageWeight) {
        double margin1, margin2;

        // Detect vehicle type and cast to it
        switch(v1) {    // For Vehicle v1
            case RamzanDrone rd -> {
                margin1 = rd.getMaxWeight() - packageWeight;
            }
            case RamzanHyperPod rhp -> {
                margin1 = rhp.getMaxWeight() - packageWeight;
            }
            case RamzanTimeShip rts -> {
                margin1 = rts.getMaxWeight() - packageWeight;
            }
            default -> {
                System.out.println("Unable to cast the invalid Vehicle Type!!");
                return null;
            }
        }

        switch(v2) {    // For Vehicle v2
            case RamzanDrone rd -> {
                margin2 = rd.getMaxWeight() - packageWeight;
            }
            case RamzanHyperPod rhp -> {
                margin2 = rhp.getMaxWeight() - packageWeight;
            }
            case RamzanTimeShip rts -> {
                margin2 = rts.getMaxWeight() - packageWeight;
            }
            default -> {
                System.out.println("Unable to cast the invalid Vehicle Type!!");
                return null;
            }
        }

        // Vehicle with greater capacity will be preferred for safety
        if(margin1 >= margin2) {
            return v1;
        } else {
            return v2;
        }
    }
}