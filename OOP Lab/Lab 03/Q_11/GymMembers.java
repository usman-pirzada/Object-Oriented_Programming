package Q_11;

import java.util.ArrayList;
import java.util.Scanner;

public class GymMembers {
    String name;

    GymMembers(String name) {   // Constructor
        this.name = name;
    }

    // ****** Methods ******
    static void register(ArrayList<GymMembers> members, String name) {
        members.add(new GymMembers(name));
        System.out.println("\n" + name + " is now a member of the Gym.");
    }

    void updateName(Scanner sc) {
        String newName;

        sc.nextLine();
        System.out.print("Enter new name: ");
        newName = sc.nextLine();

        this.name = newName;
        System.out.println("\n Name of the member changed successfully!");
    }

    static void displayMembers(ArrayList<GymMembers> members) {
        System.out.println();
        System.out.println("  Members");
        for(int i=0; i<members.size(); i++) {
            System.out.println(" " + (i+1) + ") " + members.get(i).name);
        }
    }
}