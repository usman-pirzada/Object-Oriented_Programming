package Q_01;

import java.util.ArrayList;

public class Mentor {

    // ***** Attributes *****
    private int ID;
    private String name;
    private int maxLearners;
    private Student[] assignedLearners = new Student[maxLearners];  // todo: see if it should be String/Student
    private ArrayList<String> sportsExpertise = new ArrayList<>();

    // ***** Methods *****
    void assignLearners(Student s) {    // Assign Student to a mentor if capacity available
        this.assignedLearners[0] = s;   // todo:
    }

    void removeLearner(Student s) { // Remove Student
    }

    void viewLearners() {   // View Assigned Students

    }

    void provideGuidance() {    // Provide Guidance to your Learners

    }

    public ArrayList<String> getSportsExpertise() { // todo: auto created
        return sportsExpertise;
    }

    public void setSportsExpertise(ArrayList<String> sportsExpertise) { // todo: auto created
        this.sportsExpertise = sportsExpertise;
    }
}