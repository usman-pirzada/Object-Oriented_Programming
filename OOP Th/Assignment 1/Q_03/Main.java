package Q_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char proceed = 'y';

        ArrayList<User> users = new ArrayList<>();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle(2025, 30000, "Full License", "New", "Hybrid"));
        vehicles.add(new Vehicle(2023, 25500, "Full License", "New", "Auto"));
        vehicles.add(new Vehicle(2020, 20000, "Intermediate", "Old", "Manual"));
        vehicles.add(new Vehicle(2013, 19500, "Learner", "Old", "Manual"));

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tWelcome to Vehicle Rental Service!\n");
        do {
            System.out.println("\t\tMenu");
            System.out.println(" 1) Register your account");
            System.out.println(" 2) Update account details");
            System.out.println(" 3) Book a vehicle on rent");
            System.out.println(" 4) View your rented vehicles");
            System.out.print("Enter an appropriate number to select the option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    users.add(new User());
                    sc.nextLine();
                    System.out.println("Enter your name:");
                    users.getLast().setName(sc.nextLine());

                    users.getLast().setUserID(users.size());    // Assign ID (e.g, '1' for the user at [0] index)

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

                        System.out.println("\n Your account have been created successfully with ID: " + users.getLast().getUserID());
                        break;  // Breaking lower switch
                    }
                    break;  // Breaking upper switch

                case 2:
                    if(users.isEmpty()) {
                        System.out.println("\n No account created yet! Create an account first.");
                        break;
                    }

                    System.out.println("Enter your Account ID to update info:");
                    int id = sc.nextInt();
                    if(User.verifyID(id, users)) {
                        id--;

                        System.out.println("What do you want to perform:");
                        System.out.println("1) Change Name");
                        System.out.println("2) Change Age");
                        System.out.println("3) Change Email");
                        System.out.println("4) Change License type");
                        System.out.print("Enter option number to select: ");
                        int optionNo = sc.nextInt();
                        switch (optionNo) {
                            case 1:
                                sc.nextLine();
                                System.out.println("Enter new Name:");
                                users.get(id).setName(sc.nextLine());
                                System.out.println(" Name updated successfully!");
                                break;

                            case 2:
                                System.out.println("Enter new Age:");
                                users.get(id).setAge(sc.nextInt());
                                System.out.println(" Age updated successfully!");
                                break;

                            case 3:
                                System.out.println("Enter new Email:");
                                users.get(id).setEmail(sc.nextLine());
                                System.out.println(" Email updated successfully!");
                                break;

                            case 4:
                                System.out.println("Enter new License type (\"Learner\", \"Intermediate\" or \"Full License\"):");
                                String licenseType = sc.next();
                                if(licenseType.equals("Learner") || licenseType.equals("Intermediate") || licenseType.equals("Full License")) {
                                    users.get(id).setLicenseType(licenseType);
                                    System.out.println(" License type updated successfully!");
                                } else {
                                    System.out.println("Invalid Input!!");
                                }

                                break;

                            default:
                                System.out.println("\n Invalid option number entered!!");
                        }
                    } else {
                        System.out.println(" No such ID found!");
                    }
                    break;

                case 3:
//                    users.get(0).viewVehicles();    // todo:
                    break;

                case 4:

                    break;

                default:
                    System.out.println("\n Invalid Input!!");
            }

            System.out.print("\nWould you like to proceed with another operation? (y/n): ");
            proceed = sc.next().charAt(0);
        } while (proceed == 'y' || proceed == 'Y');
        System.out.println("Good Bye!");

        sc.close();
    }
}