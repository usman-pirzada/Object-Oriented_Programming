package Q_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Device defaultDevice = new Device();
        System.out.println("\nDefault Device Added:");
        System.out.println(defaultDevice.toStringDefaultDevice());

        System.out.println();
        System.out.println("How many devices do you want to add?");
        int devicesCount = sc.nextInt();

        Device[] devices = new Device[devicesCount];

        for(int i=0; i<devices.length; i++) {
            System.out.println("\tDevice " + (i+1));

            System.out.print("Enter Device ID: ");
            int deviceID = sc.nextInt();
            System.out.print("Enter Device Type(Name): ");
            String deviceType = sc.next();
            System.out.print("Enter its power consumption: ");
            float powerConsumption = sc.nextFloat();
            System.out.print("Enter Device Status (ON/OFF): ");
            String deviceStatus = sc.next();

            devices[i] = new Device(deviceID, deviceType, powerConsumption, deviceStatus);
        }

        System.out.println("\nNew Devices Added:");
        for (int i = 0; i < devices.length; i++) {
            System.out.println(devices[i]);
        }

        System.out.println();

        for (int i = 0; i < devices.length; i++) {
            devices[i] = null;
            System.gc();
        }
    }
}