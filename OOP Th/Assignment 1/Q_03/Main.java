package Q_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char proceed;

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Corolla", 2025, 30000, "Full License", "New", "Hybrid"));
        vehicles.add(new Vehicle("Alto", 2023, 25500, "Full License", "New", "Auto"));
        vehicles.add(new Vehicle("Cultus", 2020, 20000, "Intermediate", "Old", "Manual"));
        vehicles.add(new Vehicle("Vitz", 2013, 19500, "Learners", "Old", "Manual"));
        vehicles.add(new Vehicle("Civic", 2022, 35000, "Full License", "New", "Hybrid"));
        vehicles.add(new Vehicle("Accord", 2021, 40000, "Full License", "New", "Auto"));
        vehicles.add(new Vehicle("Swift", 2019, 18000, "Intermediate", "Old", "Manual"));
        vehicles.add(new Vehicle("Prius", 2015, 25000, "Learners", "Old", "Hybrid"));

        ArrayList<User> users = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tWelcome to Vehicle Rental Service!\n");
        do {
            System.out.println("\t\tMenu");
            System.out.println(" 1) Register your account");
            System.out.println(" 2) Update account details");
            System.out.println(" 3) Rent a vehicle");
            System.out.println(" 4) View your rented vehicles");
            System.out.println(" 5) Return a rented Vehicle");
            System.out.println(" 6) View your complete details");
            System.out.print("Enter an appropriate number to select the option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1: // Account Registration
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

                case 2: // Update Account Details
                    if (users.isEmpty()) {
                        System.out.println("\n No account created yet! Create an account first.");
                        break;
                    }

                    System.out.println("Enter your Account ID to update info:");
                    int id = sc.nextInt();
                    if (User.verifyID(id, users)) {
                        id--;
                    } else {
                        System.out.println(" No such ID found!");
                        break;
                    }

                    System.out.println("\nYour Current Details:");
                    users.get(id).viewUserDetails();

                    System.out.println("\nWhich operation do you want to perform:");
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
                            sc.nextLine();
                            System.out.println("Enter new Email:");
                            users.get(id).setEmail(sc.nextLine());
                            System.out.println(" Email updated successfully!");
                            break;

                        case 4:
                            System.out.println("Enter new License type (\"Learner\", \"Intermediate\" or \"Full License\"):");
                            String licenseType = sc.next();
                            if (licenseType.equals("Learner") || licenseType.equals("Intermediate") || licenseType.equals("Full License")) {
                                users.get(id).setLicenseType(licenseType);
                                System.out.println(" License type updated successfully!");
                            } else {
                                System.out.println("Invalid Input!!");
                            }

                            break;

                        default:
                            System.out.println("\n Invalid option number entered!!");
                    }
                    break;

                case 3: // Rent a vehicle
                    if (users.isEmpty()) {
                        System.out.println("\n No account created yet! Create an account first.");
                        break;
                    }

                    System.out.println("Enter your ID to proceed:");
                    int yourID = sc.nextInt();
                    if (User.verifyID(yourID, users)) yourID--;
                    else {
                        System.out.println("Invalid ID entered!!");
                        break;  // Return to main menu
                    }

                    System.out.println("Vehicles available for rent:");
                    Vehicle.viewVehicles(vehicles);

                    int vehicleNo;
                    char input = 'n'; // to be used in do-while
                    do {
                        System.out.println("Enter vehicle no. to see its rental details:");
                        vehicleNo = sc.nextInt();
                        if(!Vehicle.verifyVehicleNo(vehicleNo, vehicles)) {
                            System.out.println("Invalid Vehicle no. entered!");
                            break;
                        } else
                            vehicleNo--;

                        vehicles.get(vehicleNo).displayRentalDetails();

                        System.out.print("Do you want to buy it on rent? (y/n) [Enter M for main menu]: ");
                        input = sc.next().charAt(0);

                        if(input == 'M' || input == 'm') break;

                    } while (input == 'N' || input == 'n');

                    if(input == 'Y' || input == 'y') {
                        if(users.get(yourID).checkEligibility(vehicles.get(vehicleNo))) {
                            users.get(yourID).rentVehicle(vehicleNo, vehicles);
                        } else {
                            System.out.println("You are not eligible for this vehicle because the license it requires is: " + vehicles.get(vehicleNo).getLicenseRequired());
                        }
                    }
                    break;

                case 4: // View rented vehicles
                    if(users.isEmpty()) {
                        System.out.println("\n No account created yet! Create an account first.");
                        break;
                    }

                    System.out.println("Enter your ID to proceed:");
                    int your_id = sc.nextInt();
                    if (User.verifyID(your_id, users)) your_id--;
                    else {
                        System.out.println("Invalid ID entered!!");
                        break;  // Return to main menu
                    }

                    System.out.println("\nYour Rented Vehicles:");
                    if(users.get(your_id).get_no_of_RentedVehicles() != 0) {
                        users.get(your_id).viewRentedVehicles();
                    } else {
                        System.out.println("\tNo Rented Vehicles!");
                    }
                    break;

                case 5: // Return rented vehicles
                    if(users.isEmpty()) {
                        System.out.println("\n No account created yet! Create an account first.");
                        break;
                    }

                    System.out.println("Enter your ID to proceed:");
                    int your_ID = sc.nextInt();
                    if (User.verifyID(your_ID, users)) your_ID--;
                    else {
                        System.out.println("Invalid ID entered!!");
                        break;  // Return to main menu
                    }

                    System.out.println();
                    if(users.get(your_ID).get_no_of_RentedVehicles() != 0) {
                        System.out.println(" Your Rented Vehicles:");
                        users.get(your_ID).viewRentedVehicles();
                    } else {
                        System.out.println("\tNo Vehicles Rented Yet!");
                        break;
                    }
                    System.out.println("Enter vehicle no. to return:");
                    vehicleNo = sc.nextInt();
                    if(vehicleNo > users.get(your_ID).get_no_of_RentedVehicles() || vehicleNo <= 0) {
                        System.out.println("Invalid Vehicle no. entered!");
                        break;
                    } else {
                        vehicleNo--;
                    }

                    users.get(your_ID).returnRentedVehicle(vehicleNo, vehicles);
                    break;

                case 6:
                    if (users.isEmpty()) {
                        System.out.println("\n No account created yet! Create an account first.");
                        break;
                    }

                    System.out.println("Enter your Account ID to update info:");
                    id = sc.nextInt();
                    if (User.verifyID(id, users)) {
                        id--;
                    } else {
                        System.out.println(" No such ID found!");
                        break;
                    }

                    System.out.println("\nYour Details:");
                    users.get(id).viewUserDetails();
                    System.out.println("Vehicles Rented:");
                    if(users.get(id).get_no_of_RentedVehicles() != 0) {
                        users.get(id).viewRentedVehicles();
                    } else {
                        System.out.println("\tNo Rented Vehicles!");
                    }

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