package Q_03;

public class AI_conflictResolution {

    /**
     * Conflict resolution method that decides between two vehicles which have equal delivery times.
     * The vehicle with the higher margin/capacity (maxWeight - packageWeight) is preferred.
     */
    public static Vehicle resolveConflict(Vehicle v1, Vehicle v2, double packageWeight) {
        double margin1 = v1.getMaxWeight() - packageWeight;
        double margin2 = v2.getMaxWeight() - packageWeight;

        // Vehicle with greater capacity will be preferred for safety
        if(margin1 >= margin2) {
            return v1;
        } else {
            return v2;
        }
    }
}