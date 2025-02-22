package Q_01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Mentor {

    // ***** Attributes *****
    private int id;
    private String name;
    private int maxLearners;
    private ArrayList<Sport> sportsExpertise = new ArrayList<>();
    private Student[] assignedLearners = new Student[maxLearners];  // todo: see if it should be String/Student

    Mentor(int id, String name, int maxLearners, ArrayList<Sport> sportsExpertise, Student[] assignedLearners) {
        this.id = id;
        this.name = name;
        this.maxLearners = maxLearners;
        this.sportsExpertise = sportsExpertise;
        this.assignedLearners = assignedLearners;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nName: " + name +
                "\nSports Expertise: " + sportsExpertise.toString() +
                "\nAssigned Learners: " + Arrays.toString(assignedLearners) +
                "\nMentorship Limit: " + maxLearners + " Learners";
    }

    // ***** Getters *****
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxLearners() {
        return maxLearners;
    }

    public Student[] getAssignedLearners() {
        return assignedLearners;
    }

    public ArrayList<Sport> getSportsExpertise() { // todo: auto created
        return sportsExpertise;
    }

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

    public void setSportsExpertise(ArrayList<Sport> sportsExpertise) { // todo: auto created
        this.sportsExpertise = sportsExpertise;
    }
}