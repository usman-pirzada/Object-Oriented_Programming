import java.util.Scanner;

class InvalidEstimateException extends Exception {
    InvalidEstimateException(String message) {
        super(message);
    }
}

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("PSL 2025 Project Hour Estimation System");
        System.out.println("=======================================");
        
        System.out.print("Enter developer name: ");
        String developerName = scanner.nextLine();
        
        System.out.print("Enter module name (Ticketing/Live Scores/Merchandise): ");
        String moduleName = scanner.nextLine();
        
        System.out.print("Enter estimated hours: ");
        String hoursInput = scanner.nextLine();
        
        try {
            if (hoursInput.isBlank()) {
                throw new IllegalArgumentException("Estimated hours cannot be empty!");
            }
                        
            int estimatedHours = Integer.parseInt(hoursInput);
            
            if (estimatedHours < 0 || estimatedHours > 100) {
                throw new InvalidEstimateException("Invalid hour estimate! Hours must be between 0 and 100.");
            }
            
            System.out.println("\nTask Assignment Summary:");
            System.out.println("Developer: " + developerName);
            System.out.println("Module: " + moduleName);
            System.out.println("Estimated Hours: " + estimatedHours);
            System.out.println("Status: Successfully assigned");
            
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid format! Please enter numeric hours only.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidEstimateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Estimation process completed.");
        }
    }
}