package Q_01;

import java.util.ArrayList;

public class Mentor {

    // ***** Attributes *****
    int ID;
    String name;
    int maxLearners;
    Student[] assignedLearners = new Student[maxLearners];  // todo: see if it should be String/Student
    ArrayList<String> sportsExpertise = new ArrayList<>();

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
}