package Q_01;

import java.util.Scanner;

public class Stadium {
    String name;
    String city;
    int capacity;
    static int matchesScheduled;

    // Methods
    void scheduleMatch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details below to schedule a match:");

        System.out.print("Enter the name of stadium: ");
        name = sc.nextLine();

        System.out.print("Enter city name: ");
        city = sc.nextLine();

        System.out.print("Enter capacity: ");
        capacity = sc.nextInt();

        matchesScheduled++;
        System.out.println("\n Match have been scheduled successfully!");
    }

    void displayDetails() {
            System.out.println("Stadium Name: " + name);
            System.out.println("City: " + city);
            System.out.println("Capacity: " + capacity);
    }
}
