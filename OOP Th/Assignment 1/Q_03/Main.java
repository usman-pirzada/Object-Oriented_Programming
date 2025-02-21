package Q_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char proceed;

        ArrayList<User> users = new ArrayList<>();
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("\t\tWelcome to Vehicle Rental Service!\n");
        while (true) {
            System.out.println("\t\tMenu");
            System.out.println("1) Register your account");
            System.out.println("2) Book a vehicle on rent");
            System.out.println("3) Exit");
            System.out.print("Enter an appropriate nummber to select the option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    users.add(new User());
                    sc.nextLine();
                    System.out.println("Enter your name:");
                    users.getLast().setName(sc.nextLine());

                    users.getLast().setUserID(users.size() + 1);    // Assign ID (e.g, '1' for the user at [0] index)

                    System.out.println("Enter your age:");
                    users.getLast().setAge(sc.nextInt());

                    System.out.println("Enter your email address:");
                    users.getLast().setEmail(sc.next());

                    while (true) {
                        System.out.println("Select your license type:");
                        System.out.println(" 1) Learners\n 2) Intermediate\n 3) Full License");
                        System.out.print("Enter option number: ");
                        switch (sc.nextInt()) {
                            case 1:
                                users.getLast().setLicenseType("Learners");
                                break;

                            case 2:
                                users.getLast().setLicenseType("Intermediate");
                                break;

                            case 3:
                                users.getLast().setLicenseType("Full License");
                                break;

                            default:
                                System.out.println("\n Invalid Input!! Try Again.");
                                continue;   // Continue while loop
                        }

                        System.out.println("You have been registered successfully!");

                        break;  // Breaking lower switch
                    }
                    break;  // Breaking upper switch

                case 2:

                    break;

                case 3:

                    sc.close();
                    return;

                default:
                    System.out.println("\n Invalid Input!!");
            }
        }
    }
}