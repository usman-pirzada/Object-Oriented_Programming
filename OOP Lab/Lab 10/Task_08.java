import java.util.Scanner;

class InvalidOrderException extends Exception {
    InvalidOrderException(String msg) {
        super(msg);
    }
}

public class Task_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Jerseys
        System.out.println("\nHow much Jerseys do you want to buy?");
        String jerseys_qty = sc.nextLine();
        try {
            if(Integer.parseInt(jerseys_qty) > 100 || Integer.parseInt(jerseys_qty) < 0) {
            throw new InvalidOrderException("The quantity of Jerseys is negative or unreasonably high (i.e., quantity > 100)");
            }
        } catch (InvalidOrderException e) {
            System.out.println("InvalidOrderException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Non-numeric characters found: " + e.getMessage());
        }
        
        System.out.print("Enter its price: ");
        String jerseys_pkr = sc.nextLine();
        try {
            if(Integer.parseInt(jerseys_pkr) > 100 || Integer.parseInt(jerseys_qty) < 0) {
            throw new InvalidOrderException("The price of Jerseys is negative or unreasonably high (i.e., price > 50000)");
            }
        } catch (InvalidOrderException e) {
            System.out.println("InvalidOrderException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Non-numeric characters found: " + e.getMessage());
        }

        // Caps
        System.out.println("\nHow much Caps do you want to buy?");
        String caps_qty = sc.nextLine();
        try {
            if(Integer.parseInt(caps_qty) > 100 || Integer.parseInt(caps_qty) < 0) {
            throw new InvalidOrderException("The quantity of Caps is negative or unreasonably high (i.e., quantity > 100)");
            }
        } catch (InvalidOrderException e) {
            System.out.println("InvalidOrderException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Non-numeric characters found: " + e.getMessage());
        }
        
        System.out.print("Enter its price: ");
        String caps_pkr = sc.nextLine();
        try {
            if(Integer.parseInt(caps_pkr) > 100 || Integer.parseInt(caps_qty) < 0) {
            throw new InvalidOrderException("The price of Caps is negative or unreasonably high (i.e., price > 50000)");
            }
        } catch (InvalidOrderException e) {
            System.out.println("InvalidOrderException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Non-numeric characters found: " + e.getMessage());
        }

        // Flags
        System.out.println("\nHow much Flags do you want to buy?");
        String flags_qty = sc.nextLine();
        try {
            if(Integer.parseInt(flags_qty) > 100 || Integer.parseInt(flags_qty) < 0) {
            throw new InvalidOrderException("The quantity of Flags is negative or unreasonably high (i.e., quantity > 100)");
            }
        } catch (InvalidOrderException e) {
            System.out.println("InvalidOrderException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Non-numeric characters found: " + e.getMessage());
        }
        
        System.out.print("Enter its price: ");
        String flags_pkr = sc.nextLine();
        try {
            if(Integer.parseInt(flags_pkr) > 100 || Integer.parseInt(flags_qty) < 0) {
            throw new InvalidOrderException("The price of Flags is negative or unreasonably high (i.e., price > 50000)");
            }
        } catch (InvalidOrderException e) {
            System.out.println("InvalidOrderException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Non-numeric characters found: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: Your input seems empty!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
