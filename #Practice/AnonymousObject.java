
import java.util.Scanner;

public class AnonymousObject {
    void factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("The factorial of the number \"" + num + "\" is: " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        new AnonymousObject().factorial(sc.nextInt());  // Anonymous object creation
    }
}
