
import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Generate random number between 0 to 99
        System.out.println((int) (Math.random() * 100));

        // Square root & Cube root
        System.out.println(Math.sqrt(25));
        System.out.println(Math.cbrt(27));

        /*
         * Examples illustrating the use of Math.ceil, Math.floor and Math.round
         * ceil is to round up to the nearest integer while floor is to round down to the nearest integer
         * returns value as double
         */
        double num1 = 7.2;
        double num2 = 7.8;

        System.out.println("Math.ceil(" + num1 + ") = " + Math.ceil("-4.2" + -4.2)); // Output: 8.0
        System.out.println("Math.ceil(" + num2 + ") = " + Math.ceil(num2)); // Output: 8.0

        System.out.println("Math.floor(" + num1 + ") = " + Math.floor(num1)); // Output: 7.0
        System.out.println("Math.floor(" + num2 + ") = " + Math.floor(num2)); // Output: 7.0

        System.out.println("Math.round(" + num1 + ") = " + Math.round(num1)); // Output: 7
        System.out.println("Math.round(" + num2 + ") = " + Math.round(num2)); // Output: 8
    }
}