package Q_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create Skills
        Skill dribbling = new Skill(1, "Dribbling", "Ability to control the ball while running");
        Skill shooting = new Skill(2, "Shooting", "Ability to shoot the ball accurately");
        Skill passing = new Skill(3, "Passing", "Ability to pass the ball to teammates");
        Skill diving = new Skill(8, "Diving", "Ability to dive into the water");
        Skill serving = new Skill(5, "Serving", "Ability to serve the ball in tennis");

        /*
        Skill tackling = new Skill(4, "Tackling", "Ability to take the ball from opponents");
        Skill swimming = new Skill(7, "Swimming", "Ability to swim efficiently");
        Skill volleying = new Skill(6, "Volleying", "Ability to hit the ball before it bounces in tennis");
        */

        // Create Sports
        ArrayList<Skill> basketballSkills = new ArrayList<>();  // Adding skills for Basketball
        basketballSkills.add(dribbling);
        basketballSkills.add(shooting);
        basketballSkills.add(passing);
        Sport basketball = new Sport(1, "Basketball", "A team sport where players try to score by shooting a ball through a hoop", basketballSkills);

        /*
        ArrayList<Skill> soccerSkills = new ArrayList<>();  // Adding skills for Soccer
        soccerSkills.add(dribbling);
        soccerSkills.add(passing);
        soccerSkills.add(tackling);
        Sport soccer = new Sport(2, "Soccer", "A team sport where players try to score by kicking a ball into a goal", soccerSkills);

        ArrayList<Skill> tennisSkills = new ArrayList<>();  // Adding skills for Tennis
        tennisSkills.add(serving);
        tennisSkills.add(volleying);
        Sport tennis = new Sport(3, "Tennis", "A sport where players use rackets to hit a ball over a net", tennisSkills);

        ArrayList<Skill> swimmingSkills = new ArrayList<>();    // Adding skills for swimming
        swimmingSkills.add(swimming);
        swimmingSkills.add(diving);
        Sport swimRacing = new Sport(4, "Swimming", "A sport where individuals race in water", swimmingSkills);
        */


        // Create Students
        ArrayList<Sport> student1Interests = new ArrayList<>(); // Adding Sports to Student1 Interests
        student1Interests.add(basketball);
        Student student1 = new Student(1, "Abdullah", 20, student1Interests);

        /*
        ArrayList<Sport> student2Interests = new ArrayList<>(); // Adding Sports to Student2 Interests
        student2Interests.add(soccer);
        student2Interests.add(tennis);
        Student student2 = new Student(2, "Abdul Rehman", 22, student2Interests);

        ArrayList<Sport> student3Interests = new ArrayList<>(); // Adding Sports to Student3 Interests
        student3Interests.add(swimRacing);
        student3Interests.add(soccer);
        Student student3 = new Student(3, "Hamza", 19, student3Interests);

        ArrayList<Sport> student4Interests = new ArrayList<>(); // Adding Sports to Student4 Interests
        student4Interests.add(tennis);
        student4Interests.add(basketball);
        Student student4 = new Student(4, "Ali", 26, student4Interests);

        ArrayList<Sport> student5Interests = new ArrayList<>(); // Adding Sports to Student5 Interests
        student5Interests.add(soccer);
        student5Interests.add(basketball);
        Student student5 = new Student(5, "Arsalan", 24, student5Interests);
        */

        // Create Mentors
        ArrayList<Sport> mentor1Expertise = new ArrayList<>();  // Adding Sports Expertise of Mentor1
        mentor1Expertise.add(basketball);
        mentor1Expertise.add(swimRacing);
        Mentor mentor1 = new Mentor(1, "Coach Umair", 5, mentor1Expertise/*, new Student[]{student1, student2, student1, student2}*/);

        // ***** Student Class Activities *****

        // ***** Mentor Class Activities *****
        // todo: it should display error for non-matching sports of mentor & student
        // todo: it should display that 3rd student cant be assigned
        mentor1.assignLearners(student2);
        mentor1.viewAssignedLearners();
        mentor1.removeLearner(student2);
        mentor1.viewAssignedLearners();
        // todo: Provide Guidance

        // ***** Sport Class Functionalities *****
        // Add/Remove Skills from a Sport
        tennis.addSkill(passing);
        tennis.showSportDetails();
        tennis.removeSkill(serving);

        // ***** Skill Class Functionalities *****
        // Update description of a skill
        diving.updateSkillDescription("Proficiency in diving into the water");
        diving.showSkillDetails();
    }
}