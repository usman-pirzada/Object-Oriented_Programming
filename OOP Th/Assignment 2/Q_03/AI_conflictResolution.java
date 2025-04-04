package Q_03;

public class AI_conflictResolution {

    /**
     * Conflict resolution method that decides between two vehicles which have equal delivery times.
     * The vehicle with the higher margin/capacity (maxWeight - packageWeight) is preferred.
     */
    public static Vehicle resolveConflict(Vehicle v1, Vehicle v2, double packageWeight) {

        System.out.println("  Resolving conflict between vehicles........");
        double margin1, margin2;

        // Detect vehicle type and cast to it
        margin1 = switch(v1) {    // For Vehicle v1
            case RamzanDrone rd -> rd.getMaxWeight() - packageWeight;
            case RamzanHyperPod rhp -> rhp.getMaxWeight() - packageWeight;
            case RamzanTimeShip rts -> rts.getMaxWeight() - packageWeight;
            default -> {
                System.out.println("Unable to cast the invalid Vehicle Type!!");
                yield Double.NEGATIVE_INFINITY;
            }
        };

        margin2 = switch(v2) {
            case RamzanDrone rd -> rd.getMaxWeight() - packageWeight;
            case RamzanHyperPod rhp -> rhp.getMaxWeight() - packageWeight;
            case RamzanTimeShip rts -> rts.getMaxWeight() - packageWeight;
            default -> {
                System.out.println("Unable to cast the invalid Vehicle Type!!");
                yield Double.NEGATIVE_INFINITY;
            }
        };

        // Vehicle with greater capacity will be preferred for safety
        if(margin1 >= margin2) {
            return v1;
        } else {
            return v2;
        }
    }
}