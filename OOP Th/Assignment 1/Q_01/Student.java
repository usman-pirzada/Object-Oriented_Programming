package Q_01;

import java.util.ArrayList;

public class Student {

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
        return name + " (ID: " + id + ")";
    }

    // ***** Methods *****
    void viewStudentDetails() {
        System.out.println("\nID: " + id + "\nName: " + name + "\nAge: " + age);
        System.out.print("\nSports Interests: ");
        if(this.sportsInterests.isEmpty()) {
            System.out.println("No Sport Interests added yet!");
            return;
        }
        for (int i = 0; i < sportsInterests.size(); i++) {
            System.out.print(sportsInterests.get(i));
            if (i < sportsInterests.size() - 1) {
                System.out.print(", ");
            }
        }
    }

    void registerForMentorship(Mentor m) {   // Register for the Mentor
        if(this.mentorAssigned != null) {
            System.out.println("Can't register the student \"" + this + "\" as it already has registered to the mentor \"" + this.mentorAssigned + "\"!");
            return;
        }

        this.mentorAssigned = m;
        m.assignLearners(this);

        System.out.println("Student \"" + this + "\" registered to the mentor \"" + m + "\" successfully!");
    }

    void unregisterFromMentor(Mentor m) {  // Unregister from the Mentor  // todo: is it ok to add it twice, once in local & then in the class wale Mentor
        if(this.mentorAssigned == null) {
            System.out.println("Can't unregister the student \"" + this + "\" as it already has not registered to any mentor!");
        }

        if(this.mentorAssigned.equals(m)) {
            this.mentorAssigned = null;
            m.removeLearner(this);

            System.out.println("Student \"" + this + "\" unregistered from the mentor \"" + m + "\" successfully!");
        }
    }

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
        if(this.mentorAssigned == null) {
            System.out.println("No Mentor Assigned Yet!");
            return;
        }
        this.mentorAssigned.viewMentorDetails();
    }

}