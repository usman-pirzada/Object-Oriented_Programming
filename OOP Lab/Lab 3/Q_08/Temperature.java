package Q_08;

import java.util.Scanner;

public class Temperature {
    float[] originalTemp;
    int arrLength;

    float[] modifiedTemp;

    void storeTemp(Scanner sc) {
        System.out.print("Enter the length of array for storing temperatures: ");
        arrLength = sc.nextInt();

        originalTemp = new float[arrLength];

        System.out.println("Enter all the temperature values separated by spaces:");
        for (int i = 0; i < originalTemp.length; i++) {
            originalTemp[i] = sc.nextFloat();
        }
    }

    void increaseTemp(float value) {
        modifiedTemp = new float[originalTemp.length];

        for(int i = 0; i < originalTemp.length; i++) {
            modifiedTemp[i] = originalTemp[i] + value;
        }
    }

    void displayTemp() {
        System.out.println();
        System.out.print("Original Temperatures in Karachi: ");
        for(float temp: originalTemp) {
            System.out.print(temp + "  ");
        }

        System.out.println();
        if(modifiedTemp == null) {
            System.out.println("\nNo modified temperature!");
            return;
        }

        System.out.print("Adjusted Temperatures in Karachi: ");
        for(float temp: modifiedTemp) {
            System.out.print(temp + "  ");
        }
    }
}