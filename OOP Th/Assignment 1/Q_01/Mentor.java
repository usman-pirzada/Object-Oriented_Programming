package Q_01;

import java.util.ArrayList;

public class Mentor {

    // ***** Attributes *****
    private int id;
    private String name;
    private int maxLearners;
    private ArrayList<Sport> sportsExpertise;
    private Student[] assignedLearners = new Student[3];

    Mentor(int id, String name, int maxLearners, ArrayList<Sport> sportsExpertise/*, Student[] assignedLearners*/) {    // todo: dependency i.e, Student in constructor parameter
        this.id = id;
        this.name = name;
        this.maxLearners = maxLearners;
        this.sportsExpertise = sportsExpertise;
//        this.assignLearners(assignedLearners);
    }

    void viewMentorDetails() {
        System.out.println("\nID: " + id + "\nName: " + name + "\nMentorship Limit: " + maxLearners + " Learners");
        System.out.print("\nSports Expertise: ");
        for (int i = 0; i < sportsExpertise.size(); i++) {
            System.out.print(sportsExpertise.get(i).name);
            if (i < sportsExpertise.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\nAssigned Learners: ");
        for (Student learner : assignedLearners) {
            System.out.print(learner.name);
            if (learner != assignedLearners[assignedLearners.length - 1]) {
                System.out.print(", ");
            }
        }
    }

    // ***** Getters *****
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getMaxLearners() {
//        return maxLearners;
//    }
//
//    public Student[] getAssignedLearners() {
//        return assignedLearners;
//    }
//
//    public ArrayList<Sport> getSportsExpertise() { // todo: auto created
//        return sportsExpertise;
//    }

    // ***** Methods *****
//    void assignLearners(Student[] students) {    // Assign Student to a mentor if capacity available
//        for (Student s : students) {
//            assignLearners(s);
//        }
//    }

    void assignLearners(Student s) {    // Assign Student to a mentor if capacity available
        for (int i = 0; i < assignedLearners.length; i++) {
            if (assignedLearners[i] == null) {
                assignedLearners[i] = s;
                return;
            }
        }
        System.out.println("\nUnable to assign the learner " + s.name + " (ID: " + s.id + "). This mentor has capacity of only " + assignedLearners.length + " learners.");
    }

//    void removeLearner(Student s) { // Remove Student
//    }

//    void viewLearners() {   // View Assigned Students
//
//    }

//    void provideGuidance() {    // Provide Guidance to your Learners
//
//    }

//    public void setSportsExpertise(ArrayList<Sport> sportsExpertise) { // todo: auto created
//        this.sportsExpertise = sportsExpertise;
//    }
}