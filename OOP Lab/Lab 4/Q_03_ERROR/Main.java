package Q_03_ERROR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ShoppingCard product;

        System.out.print("\nEnter product name to add to card (Write \"null\" to add Default product): ");
        String prodName = sc.next();

        if(prodName.equalsIgnoreCase("null")) {
            product = new ShoppingCard();
        } else {
            System.out.print("Enter its price: ");
            double price = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            product = new ShoppingCard(prodName, price, qty);
        }

        System.out.print("\nDo you want to remove the added product now (y/n): ");
        if(sc.next().charAt(0) == 'y' || sc.next().charAt(0) == 'Y') {
            product = null;
            System.gc();
        }
    }
}