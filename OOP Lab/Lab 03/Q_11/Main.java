package Q_11;

import  java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<GymMembers> members = new ArrayList<>();

        while (true) {
            System.out.println("\n  Operations");
            System.out.println(" 1) Add new member");
            System.out.println(" 2) List all member");
            System.out.println(" 3) Update member's name");
            System.out.println(" 4) Remove a member");
            System.out.println(" 5) Exit");
            System.out.print("Enter option number to select: ");
            switch (sc.nextInt()) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter member's name to add a new member to Gym: ");
                    GymMembers.register(members, sc.nextLine());
                    break;

                case 2:
                    if (members.isEmpty()) {
                        System.out.println("No members added yet!");
                        break;
                    }
                    GymMembers.displayMembers(members);
                    break;

                case 3:
                    if (members.isEmpty()) {
                        System.out.println("No members added yet!");
                        break;
                    }
                    GymMembers.displayMembers(members);
                    System.out.print("Enter member no. to update his name: ");
                    int index = (sc.nextInt()) - 1;
                    if(index > members.size() || index < 0) {
                        System.out.println("Invalid Input!!");
                        break;
                    }
                    members.get(index).updateName(sc);
                    break;

                case 4:
                    if (members.isEmpty()) {
                        System.out.println("No members added yet!");
                        break;
                    }
                    GymMembers.displayMembers(members);
                    System.out.print("Enter member no. to remove: ");
                    int i = (sc.nextInt()) - 1;
                    if(i > members.size() || i < 0) {
                        System.out.println("Invalid Input!!");
                        break;
                    }

                    members.remove(i);
                    System.out.println("\nMember removed successfully!");
                    break;

                case 5:
                    System.out.println("Good Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Input!!");
            }
        }
    }
}