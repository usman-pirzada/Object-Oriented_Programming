package Q_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        System.out.println("\nDefault Employee Created:");
        System.out.println(e1);

        Scanner sc = new Scanner(System.in);

        System.out.println("\nNow enter the details below for another employee.");
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        System.out.print("Enter Tax Percentage: ");
        float taxPercent = sc.nextFloat();
        System.out.print("Enter Bonus Amount: ");
        double bonusAmount = sc.nextDouble();

        Employee e2 = new Employee(id, name, basicSalary, taxPercent, bonusAmount);

        System.out.println("\nNew Employee Added:");
        System.out.println(e2);

        System.out.println();

        e1 = null;
        System.out.println("Memory for the bonus amount released!");

        e2 = null;
        System.out.println("Memory for the bonus amount released!");

        System.gc();
    }
}