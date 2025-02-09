package Q_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RetailStore price = new RetailStore();

        while (true) {
            System.out.println("\nWelcome to Discount Bazar!");
            System.out.println();
            System.out.println("1) Store price");
            System.out.println("2) Apply Discount");
            System.out.println("3) Display Original & Discounted Prices");
            System.out.println("4) Exit");
            System.out.print("Enter a number to select an option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println();
                    price.storePrice(sc);
                    System.out.println("Price values stored successfully!");
                    break;

                case 2:
                    if(price.originalPrice == null) {
                        System.out.println("No prices stored yet!!");
                        break;
                    }

                    System.out.println();
                    System.out.println("By how much percent do you want to apply discount to all the prices?");
                    float value = sc.nextFloat();
                    price.applyDiscount(value);
                    System.out.println("Discount Applied Successfully!");
                    break;

                case 3:
                    if(price.originalPrice == null) {
                        System.out.println("No prices stored yet!!");
                        break;
                    }

                    price.displayPrice();
                    break;

                case 4:
                    System.out.println("Good Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Input!! Try Again.");
            }
        }
    }
}