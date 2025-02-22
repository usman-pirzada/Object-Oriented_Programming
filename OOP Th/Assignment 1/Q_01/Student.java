package Q_01;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    // ***** Attributes *****
    int id;
    String name;
    int age;
    ArrayList<Sport> sportsInterests = new ArrayList<>();

    Student(int id, String name, int age, ArrayList<Sport> sportsInterests) {
        this.id =id;
        this.name = name;
        this.age = age;
        this.sportsInterests = sportsInterests;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nName: " + name +
                "\nAge: " + age +
                "\nSports Interests: " + Arrays.toString(sportsInterests.stream().toArray());
    }

    // ***** Methods *****
    void updateSportsInterest(Sport s) {    // Update Sport Interests

    }

    void viewMentorDetails() {  // View Mentor Details

    }

    void registerForMentorship(Mentor m) {  // Register for Mentorship

    }
}