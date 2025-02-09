package Q_09;

import java.util.Scanner;

public class RetailStore {
    float[] originalPrice;
    int arrLength;

    float[] modifiedPrice;

    void storePrice(Scanner sc) {
        System.out.print("Enter the length of array for storing prices: ");
        arrLength = sc.nextInt();

        originalPrice = new float[arrLength];

        System.out.println("Enter all the price values separated by spaces:");
        for (int i = 0; i < originalPrice.length; i++) {
            originalPrice[i] = sc.nextFloat();
        }
    }

    void applyDiscount(float discountPercent) {
        modifiedPrice = new float[originalPrice.length];

        for(int i = 0; i < originalPrice.length; i++) {
            modifiedPrice[i] = originalPrice[i] - (originalPrice[i] * discountPercent/100);
        }
    }

    void displayPrice() {
        System.out.println();
        System.out.print("Original Prices: ");
        for(float price: originalPrice) {
            System.out.print(price + "  ");
        }

        System.out.println();
        if(modifiedPrice == null) {
            System.out.println("\nNo modified price!");
            return;
        }

        System.out.print("Discounted Prices: ");
        for(float price: modifiedPrice) {
            System.out.print(price + "  ");
        }
    }
}