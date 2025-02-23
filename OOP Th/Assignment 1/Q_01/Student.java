package Q_01;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    // ***** Attributes *****
    int id;
    String name;
    int age;
    ArrayList<Sport> sportsInterests;

    Student(int id, String name, int age, ArrayList<Sport> sportsInterests) {
        this.id =id;
        this.name = name;
        this.age = age;
        this.sportsInterests = sportsInterests;
    }

    // ***** Methods *****
    void viewStudentDetails() {
        System.out.println("\nID: " + id + "\nName: " + name + "\nAge: " + age);
        System.out.print("\nSports Interests: ");
        for (int i = 0; i < sportsInterests.size(); i++) {
            System.out.print(sportsInterests.get(i).name);
            if (i < sportsInterests.size() - 1) {
                System.out.print(", ");
            }
        }
    }

//    void registerForMentorship(Mentor m) {  // Register for Mentorship
//
//    }

//    void updateSportsInterest(Sport s) {    // Update Sport Interests
//
//    }

//    void viewMentorDetails() {  // View Mentor Details
//
//    }

}