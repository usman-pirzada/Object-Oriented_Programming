package Question_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float tempInC = sc.nextFloat();

        float tempInF = ((tempInC * 9) / 5) + 32;
        System.out.println("The temprature in Fahrenheit is " + tempInF);
    }
}