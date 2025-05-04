import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String input1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String input2 = sc.nextLine();

        System.out.print("Which operation do you perform (+, -, /, *): ");
        String operation = sc.next();

        try {
            if(input1.isBlank() || input2.isBlank()) {
                throw new IllegalArgumentException("Your input seems empty!");
            }

            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            double ans = 0;

            switch (operation) {
                case "+":
                    ans = num1 + num2;
                    break;

                case "-":
                    ans = num1 - num2;
                    break;

                case "*":
                    ans = num1 * num2;
                    break;

                case "/":
                    ans = num1 / num2;
                    break;

                default:
                    throw new IllegalArgumentException();
            }


            System.out.println("Answer: " + ans);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Your number contains non-numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input: " + e.getMessage());
        }































        
        // String input1, input2, operation;
        // double num1, num2, result;

        // try {
        //     // Get first number
        //     System.out.print("Enter first number: ");
        //     input1 = sc.nextLine();
            
        //     // Check if first input is null or empty
        //     if (input1 == null || input1.trim().isEmpty()) {
        //         throw new IllegalArgumentException("First number cannot be empty");
        //     }
            
        //     // Get second number
        //     System.out.print("Enter second number: ");
        //     input2 = sc.nextLine();
            
        //     // Check if second input is null or empty
        //     if (input2 == null || input2.trim().isEmpty()) {
        //         throw new IllegalArgumentException("Second number cannot be empty");
        //     }
            
        //     // Get operation
        //     System.out.print("Enter operation (+, -, *, /): ");
        //     operation = sc.nextLine();
            
        //     // Parse numbers
        //     num1 = Double.parseDouble(input1);
        //     num2 = Double.parseDouble(input2);
            
        //     // Perform operation
        //     switch (operation) {
        //         case "+":
        //             result = num1 + num2;
        //             break;
        //         case "-":
        //             result = num1 - num2;
        //             break;
        //         case "*":
        //             result = num1 * num2;
        //             break;
        //         case "/":
        //             if (num2 == 0) {
        //                 throw new ArithmeticException("Cannot divide by zero");
        //             }
        //             result = num1 / num2;
        //             break;
        //         default:
        //             throw new IllegalArgumentException("Invalid operation. Use +, -, *, or /");
        //     }
            
        //     // Display result
        //     System.out.println("Result: " + result);
            
        // } catch (NumberFormatException e) {
        //     System.out.println("Error: Input contains non-numeric characters");
        // } catch (ArithmeticException e) {
        //     System.out.println("Error: " + e.getMessage());
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Error: " + e.getMessage());
        // } finally {
        //     sc.close();
        // }
    }
}