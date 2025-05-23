package Q_03;

import java.util.Scanner;

public class DecisionMaking {
    
    /**
     * Decision-making Method
     * It will return an efficient/appropriate vehicle based on different calculations and scenerios
     * If there will be conflict between two vehicles, it will then refer to the method "AI_conflictResolutionSystem"
     */
    protected static Vehicle decisionMakingSystem(Vehicle[] vehicles, boolean urgencyLevel) {

        System.out.println("  Making decision between vehicles......");

        if(urgencyLevel) {
            Scanner sc = new Scanner(System.in);

            System.out.println("How do you want package to be delivered:");
            System.out.println(" 1) Time specific delivery");
            System.out.println(" 2) Sehri/Iftar time delivery");
            int deliveryOption = sc.nextInt();
            switch(deliveryOption) {
                case 1: // Return RamzanTimeShip Vehicle
                    return vehicles[0];

                case 2: // Return RamzanDrone OR RamzanHyperPod Vehicle // todo:
                    int j = -1;
                    double minDeliveryTime = Double.MAX_VALUE;

                    for (int i = 0; i < vehicles.length; i++) {
                        double deliveryTime = Double.MAX_VALUE;

                        if(vehicles[i] instanceof RamzanDrone ramzanDrone) {
                            deliveryTime = ramzanDrone.cal_delivery_time(ramzanDrone.getDistanceToCover(), ramzanDrone.getMaxSpeed());

                        } else if(vehicles[i] instanceof RamzanTimeShip ramzanTimeShip) {   // A RamzanTimeShip treats “urgent” packages as historically sensitive, requiring validationbefore transport.
                            deliveryTime = ramzanTimeShip.cal_delivery_time(ramzanTimeShip.getDistanceToCover(), ramzanTimeShip.getMaxSpeed());

                        } else if(vehicles[i] instanceof RamzanHyperPod ramzanHyperPod) {
                            deliveryTime = ramzanHyperPod.cal_delivery_time(ramzanHyperPod.getDistanceToCover(), ramzanHyperPod.getMaxSpeed());
                        }

                        if(deliveryTime < minDeliveryTime) {
                            minDeliveryTime = deliveryTime;
                            j = i;

                        } else if(deliveryTime == minDeliveryTime) {
                            // refer to conflictResolverMethod
                        }
                    }

                    return vehicles[2];

                default:
                    System.out.println("Invalid Input!! Try Again.");
                    return decisionMakingSystem(vehicles, urgencyLevel);
            }
        }

        /**
         * Below logic will work for when urgencyLevel is false
         * Here system will predict fastest/optimal vehicle based on "MaxWeight", "MaxSpeed" and "deliveryTime".
         */
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight of the package between \"0-130\" (in kg): ");
        double packageWeight = sc.nextDouble();
        if(packageWeight <= 0 || packageWeight > 130) {
            System.out.println("Incompatible package weight!! Try again.");
            return decisionMakingSystem(vehicles, urgencyLevel);
        }

    
        Vehicle bestVehicle = null;
        double minDeliveryTime = Double.MAX_VALUE;
        
        for(Vehicle v : vehicles) {

            // Below vehicle detecting and casting logic was not needed if used "abstract" declaration of getters in abstract Vehicle class

            double v_maxWeight;
            double deliveryTime;
            // double v_distanceToCover;
            // double v_maxSpeed;

            // Detect vehicle type and cast to it
            switch(v) {
                case RamzanDrone rd -> {
                    v_maxWeight = rd.getMaxWeight();
                    deliveryTime = rd.cal_delivery_time(rd.getDistanceToCover(), rd.getMaxSpeed());
                    // v_maxSpeed = rd.getMaxSpeed();
                    // v_distanceToCover = rd.getDistanceToCover();
                }
                case RamzanHyperPod rhp -> {
                    v_maxWeight = rhp.getMaxWeight();
                    deliveryTime = rhp.cal_delivery_time(rhp.getDistanceToCover(), rhp.getMaxSpeed());
                    // v_maxSpeed = rhp.getMaxSpeed();
                    // v_distanceToCover = rhp.getDistanceToCover();
                }
                case RamzanTimeShip rts -> {
                    v_maxWeight = rts.getMaxWeight();
                    deliveryTime = rts.cal_delivery_time(rts.getDistanceToCover(), rts.getMaxSpeed());
                    // v_maxSpeed = rts.getMaxSpeed();
                    // v_distanceToCover = rts.getDistanceToCover();
                }
                default -> {
                    System.out.println("Skipped the Invalid Vehicle Type!!");
                    continue; // Skip unknown vehicle types
                }
            }

            // Check if the detected vehicle can handle the package weight
            if(v_maxWeight >= packageWeight) {
                
                if(deliveryTime < minDeliveryTime) {
                    minDeliveryTime = deliveryTime;
                    bestVehicle = v;

                } else if (deliveryTime == minDeliveryTime) {
                    // Conflict resolution if two vehicles have the same delivery time
                    bestVehicle = AI_conflictResolution.resolveConflict(bestVehicle, v, packageWeight);
                }

            }
        }

        return bestVehicle;

    }
}