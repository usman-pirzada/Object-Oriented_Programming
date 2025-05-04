import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number to find its factorial:");
            String string_num = sc.nextLine();

            int factorial = 1;

            try {
                if(string_num.isEmpty()) {
                    throw new IllegalArgumentException("You input nothing!");
                }

                if(Integer.parseInt(string_num) < 0) {
                    throw new IllegalArgumentException("Negative numbers are not allowed!");
                }

                for(int i = 1; i <= Integer.parseInt(string_num); i++) {
                    factorial = Math.multiplyExact(factorial, i);
                }
                
                System.out.println("Factorial: " + factorial);
            } catch (NumberFormatException e) {
                System.out.println("It contains non-numeric characters!");
            } catch (ArithmeticException e) {
                System.out.println("Number is too large to find factorial!");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Input: " + e.getMessage());
            }
    }
}
