package Q_06;

import java.util.Scanner;

class Employee {
    String name;
    int id;
    String department;

    Employee(Scanner sc) {
        System.out.println("Enter Name:");
        name = sc.nextLine();

        System.out.println("Enter ID:");
        id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Department:");
        department = sc.nextLine();

        System.out.println("Employee Constructor: " + this.name + " (ID: " + this.id + ") from " + this.department);
    }
}