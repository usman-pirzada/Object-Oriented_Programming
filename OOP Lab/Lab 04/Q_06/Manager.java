package Q_06;

import java.util.Scanner;

class Manager extends Employee {
    int teamSize;

    Manager(Scanner sc) {
        super(sc);

        System.out.println("Enter Team Size:");
        teamSize = sc.nextInt();

        System.out.println("Manager Constructor: Manages " + this.teamSize + " team members.");
    }
}