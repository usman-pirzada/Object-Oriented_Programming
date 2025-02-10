package Q_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Session {
    String sessionTitle;
    String speakerName;
    double duration;
    String room;

    // Constructor
    Session(String sessionTitle, String speakerName, double duration, String room) {
        this.sessionTitle = sessionTitle;
        this.speakerName = speakerName;
        this.duration = duration;
        this.room = room;   // todo: Shallow copy DONE
    }

    // Methods
    static void scheduleSession(ArrayList<Session> sessions) {
        String sessionTitle;
        String speakerName;
        double duration;
        String room;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Session Title: ");
        sessionTitle = sc.nextLine();
        System.out.print("Enter Speaker Name: ");
        speakerName = sc.nextLine();
        System.out.print("Enter Duration (in hours): ");
        duration = sc.nextDouble();
        System.out.print("Enter Room: ");
        room = sc.next();

        sessions.add(new Session(sessionTitle, speakerName, duration, room));
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
            System.out.println("Room: " + room);
            i++;
        }
    }
}
