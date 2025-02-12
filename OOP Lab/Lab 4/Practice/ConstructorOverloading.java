package Practice;

import java.util.Scanner;

public class ConstructorOverloading {
    String studentName;
    String id;
    int semesterNo;

    ConstructorOverloading(String studentName, String id) {
        this.studentName = studentName;
        this.id = id;
        this.semesterNo = 1;
    }

    ConstructorOverloading(String studentName, String id, int semesterNo) {
        this.studentName = studentName;
        this.id = id;
        this.semesterNo = semesterNo;
    }

    public String toString() {
        return "Name: " + studentName + "\nID: " + id + "\nSemester No: " + semesterNo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tRegistering freshmens for Procom....");
        System.out.print("Enter your Name: ");
        String stName = sc.nextLine();
        System.out.print("Enter your ID: ");
        String id = sc.nextLine();
        ConstructorOverloading student1 = new ConstructorOverloading(stName, id);

        System.out.println();
        System.out.println("\tRegistering other FASTians for Procom....");
        System.out.print("Enter your Name: ");
        stName = sc.nextLine();
        System.out.print("Enter your ID: ");
        id = sc.nextLine();
        System.out.print("Enter your semester number: ");
        int sem = sc.nextInt();
        ConstructorOverloading student2 = new ConstructorOverloading(stName, id, sem);

        System.out.println("1st Student:" + student1);
        System.out.println("2nd Student:" + student2);
    }
}