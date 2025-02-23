package Q_01;

import java.util.ArrayList;

public class Student {

    // ***** Attributes *****
    private int id;
    private String name;
    private int age;
    private ArrayList<Sport> sportsInterests;
    private Mentor mentorAssigned;

    Student(int id, String name, int age, ArrayList<Sport> sportsInterests) {
        this.id =id;
        this.name = name;
        this.age = age;
        this.sportsInterests = sportsInterests;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }

    // ***** Methods *****
    void viewStudentDetails() {
        System.out.println("\nID: " + id + "\nName: " + name + "\nAge: " + age);
        System.out.print("\nSports Interests: ");
        for (int i = 0; i < sportsInterests.size(); i++) {
            System.out.print(sportsInterests.get(i).getName());
            if (i < sportsInterests.size() - 1) {
                System.out.print(", ");
            }
        }
    }

//    void registerForMentorship(Mentor m) {  // todo: Register for Mentorship
//
//    }

    void addSportsInterest(Sport s) {    // Add a Sport Interest
        this.sportsInterests.add(s);
        System.out.println("Sport \"" + s + "\" added to the Sport interests of \"" + this +"\" successfully!");
    }

    void removeSportsInterest(Sport s) {    // Add a Sport Interest
        if(this.sportsInterests.contains(s)) {
            this.sportsInterests.remove(s);
            System.out.println("Sport \"" + s + "\" removed from the Sport interests of \"" + this +"\" successfully!");
            return;
        }

        System.out.println("Unable to remove Sport \"" + s + "\" from the Sport interests of \"" + this +"\" as it does not exists there!");
    }

    void viewMentorDetails() {  // View Mentor Details
        this.mentorAssigned.viewMentorDetails();
    }

}