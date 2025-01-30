import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Integer: ");
        int num3 = sc.nextInt();

        // Sum
        System.out.println("The sum of the integers is " + (num1+num2+num3));

        // Average
        System.out.println("Tne average of the integers is " + ((num1+num2+num3)/3));

        // Product
        System.out.println("The  product of the integers is " + (num1*num2*num3));
    }
}