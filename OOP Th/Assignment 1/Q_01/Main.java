package Q_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create Tennis skill
        Skill serving = new Skill(1, "Serving", "Ability to serve the ball effectively");
        Skill forehand = new Skill(2, "Forehand", "Powerful forehand stroke");

        // Create Tennis sport
        ArrayList<Skill> tennisSkills = new ArrayList<>();
        tennisSkills.add(serving);
        tennisSkills.add(forehand);
        Sport tennis = new Sport(1, "Tennis", "A racquet sport played individually or in pairs", tennisSkills);

        // Create mentor Ali with tennis expertise.
        ArrayList<Sport> aliExpertise = new ArrayList<>();
        aliExpertise.add(tennis);
        Mentor ali = new Mentor(1, "Ali", 3, aliExpertise);

        // Create student Saad with tennis interest
        ArrayList<Sport> saadInterests = new ArrayList<>();
        saadInterests.add(tennis);
        Student saad = new Student(1, "Saad", 20, saadInterests);

        // Create two more students
        Student huzaifa = new Student(2, "Huzaifa", 21, saadInterests);
        Student umer = new Student(3, "Umer", 19, saadInterests);
        Student hassan = new Student(4, "Hassan", 22, saadInterests);

        // Register students for mentorship
        saad.registerForMentorship(ali);
        huzaifa.registerForMentorship(ali);
        umer.registerForMentorship(ali);

        // Try to register fourth student (should fail as capacity is full)
        hassan.registerForMentorship(ali);

        // View mentor's assigned learners
        ali.viewMentorDetails();

        // Unregister Saad and try registering Hassan again
        saad.unregisterFromMentor(ali);
        hassan.registerForMentorship(ali);

        // Provide guidance to remaining students
        ali.provideGuidance(huzaifa, tennis);
        ali.provideGuidance(umer, tennis);
        ali.provideGuidance(hassan, tennis);

        // Try to provide guidance to unregistered student (should fail)
        ali.provideGuidance(saad, tennis);
    }
}