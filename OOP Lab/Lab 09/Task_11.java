abstract class ElectricityConsumer {
    int consumerId;
    int unitsConsumed;
    int peakHourUsage;

    abstract double calculateBill();
    abstract double applyPeakHourPenalty(double billAmount);
    
    void generateBill() {
        double billAmount = calculateBill();
        billAmount = applyPeakHourPenalty(billAmount);

        System.out.println("----------------");
        System.out.println("You have to pay Rs." + billAmount + " to clear your bill.");
        System.out.println("----------------");
    }
}

public class Task_11 {
    public static void main(String[] args) {
        
    }
}