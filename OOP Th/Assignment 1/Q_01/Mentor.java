package Q_01;

import java.util.ArrayList;

public class Mentor {

    // ***** Attributes *****
    private int id;
    private String name;
    private int maxLearners;
    private ArrayList<Sport> sportsExpertise;
    private Student[] assignedLearners = new Student[3];

    Mentor(int id, String name, int maxLearners, ArrayList<Sport> sportsExpertise) {    // todo: dependency i.e, Student in constructor parameter
        this.id = id;
        this.name = name;
        this.maxLearners = maxLearners;
        this.sportsExpertise = sportsExpertise;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }

    // **** Methods ****
    void viewMentorDetails() {
        System.out.println("\nID: " + id + "\nName: " + name + "\nMentorship Limit: " + maxLearners + " Learners");
        System.out.print("\nSports Expertise: ");
        for (int i = 0; i < sportsExpertise.size(); i++) {
            System.out.print(sportsExpertise.get(i));
            if (i < sportsExpertise.size() - 1) {
                System.out.print(", ");
            }
        }

        this.viewAssignedLearners();
    }
//        System.out.println("\nAssigned Learners: ");
//        for (Student learner : assignedLearners) {
//            System.out.print(learner);
//            if (learner != assignedLearners[assignedLearners.length - 1]) {
//                System.out.print(", ");
//            }
//        }

//    void assignLearners(Student[] students) {    // Assign Student to a mentor if capacity available
//        for (Student s : students) {
//            assignLearners(s);
//        }
//    }

    void assignLearners(Student s) {    // Assign Student to a mentor if capacity available
        for (int i = 0; i < assignedLearners.length /*todo: OR this.maxLearners*/; i++) {
            if (assignedLearners[i] == null) {
                assignedLearners[i] = s;
                System.out.println("\nThe learner \"" + s + "\" assigned to \"" + this + "\" mentor successfully!");
                return;
            }
        }
        System.out.println("\nUnable to assign the learner \"" + s + "\" to " + this + "\" mentor as he/she has capacity of only " + assignedLearners.length + " learners.");
    }

    void removeLearner(Student s) { // Remove Student
        boolean removed = false;

        for (int i = 0; i < assignedLearners.length; i++) {
            if(this.assignedLearners[i] != null && this.assignedLearners[i].equals(s)) {
                this.assignedLearners[i] = null;
                System.out.println("Student \"" + s + "\" removed successfully!");
                removed = true;
                break;
            }
        }
        if(!removed) {
            System.out.println("Unable to remove student \"" + s + "\" as it does not exist!");
        }
    }

    void viewAssignedLearners() {   // todo: it is accessible to Student, how to prevent so that Main can access
        System.out.println("Assigned Learners of \"" + this + "\":");

        if(assignedLearners == null) {  // todo: may be error
            System.out.println("\tNo Learners Assigned!");
            return;
        }

        for (Student s : assignedLearners) {
            System.out.println("\t" + s);
        }
    }
}