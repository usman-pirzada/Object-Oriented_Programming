package Q_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Session {
    String sessionTitle;
    String speakerName;
    double duration;
    int roomNumber;

    // Constructor
    Session(String sessionTitle, String speakerName, double duration, int roomNumber) {
        this.sessionTitle = sessionTitle;
        this.speakerName = speakerName;
        this.duration = duration;
        this.roomNumber = roomNumber;
    }

    // Methods
    static void scheduleSession(ArrayList<Session> sessions) {
        String sessionTitle;
        String speakerName;
        double duration;
        int roomNumber;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Session Title: ");
        sessionTitle = sc.nextLine();
        System.out.print("Enter Speaker Name: ");
        speakerName = sc.nextLine();
        System.out.print("Enter Duration: ");
        duration = sc.nextDouble();
        System.out.print("Enter Room Number: ");
        roomNumber = sc.nextInt();

        sessions.add(new Session(sessionTitle, speakerName, duration, roomNumber));
        System.out.println("Session Added Successfully!");
    }

    void displaySessionDetails(ArrayList<Session> sessions) {
        int i = 1;

        System.out.println("\n\tAll Sessions Details");
        System.out.println("\t====================");
        for (Object s: sessions) {
            System.out.println("\n  Session " + i);
            System.out.println("Title: " + sessionTitle);
            System.out.println("Speaker Name: " + speakerName);
            System.out.println("Duration (in hours): " + duration);
            System.out.println("Room Number: " + roomNumber);
            i++;
        }
    }
}
