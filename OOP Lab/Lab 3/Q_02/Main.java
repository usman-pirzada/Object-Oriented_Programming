package Q_02;

import Q_01.Stadium;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Session> sessions = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an option to proceed:");
            System.out.println("1) Schedule a Session");
            System.out.println("2) Display details about scheduled sessions");
            System.out.println("3) Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("\nEnter the details below to schedule a session:");
                    Session.scheduleSession(sessions);
                    break;

                case 2:
                    if (sessions.isEmpty()) {
                        System.out.println("\nNo sessions scheduled yet!!");
                        break;
                    }

                    System.out.print("------------------------------------");
                    sessions.get(0).displaySessionDetails(sessions);
                    System.out.println("------------------------------------");
                    break;

                case 3:
                    System.out.println("ThankYou for using this program. Good Bye!");
                    return;

                default:
                    System.out.println("Invalid Input!! Try Again.");
            }
        }
    }
}
