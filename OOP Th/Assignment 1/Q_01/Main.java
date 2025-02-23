package Q_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        // Create Skills
//        Skill skill1 = new Skill(1, "Dribbling", "Ability to control the ball while running");
//        Skill skill2 = new Skill(2, "Shooting", "Ability to shoot the ball accurately");
//        Skill skill3 = new Skill(3, "Passing", "Ability to pass the ball to teammates");
//        Skill skill4 = new Skill(4, "Tackling", "Ability to take the ball from opponents");
//
//        // Create Sports
//        ArrayList<Skill> basketballSkills = new ArrayList<>();
//        basketballSkills.add(skill1);
//        basketballSkills.add(skill2);
//        basketballSkills.add(skill3);
//        Sport basketball = new Sport(1, "Basketball", "A team sport where players try to score by shooting a ball through a hoop", basketballSkills);
//
//        ArrayList<Skill> soccerSkills = new ArrayList<>();
//        soccerSkills.add(skill1);
//        soccerSkills.add(skill3);
//        soccerSkills.add(skill4);
//        Sport soccer = new Sport(2, "Soccer", "A team sport where players try to score by kicking a ball into a goal", soccerSkills);

        // Create Skills
        Skill skill1 = new Skill(1, "Dribbling", "Ability to control the ball while running");
        Skill skill2 = new Skill(2, "Shooting", "Ability to shoot the ball accurately");
        Skill skill3 = new Skill(3, "Passing", "Ability to pass the ball to teammates");
        Skill skill4 = new Skill(4, "Tackling", "Ability to take the ball from opponents");
        Skill skill5 = new Skill(5, "Serving", "Ability to serve the ball in tennis");
        Skill skill6 = new Skill(6, "Volleying", "Ability to hit the ball before it bounces in tennis");
        Skill skill7 = new Skill(7, "Swimming", "Ability to swim efficiently");
        Skill skill8 = new Skill(8, "Diving", "Ability to dive into the water");

        // Create Sports
        ArrayList<Skill> basketballSkills = new ArrayList<>();  // Adding skills for Basketball
        basketballSkills.add(skill1);
        basketballSkills.add(skill2);
        basketballSkills.add(skill3);
        Sport basketball = new Sport(1, "Basketball", "A team sport where players try to score by shooting a ball through a hoop", basketballSkills);

        ArrayList<Skill> soccerSkills = new ArrayList<>();  // Adding skills for Soccer
        soccerSkills.add(skill1);
        soccerSkills.add(skill3);
        soccerSkills.add(skill4);
        Sport soccer = new Sport(2, "Soccer", "A team sport where players try to score by kicking a ball into a goal", soccerSkills);

        ArrayList<Skill> tennisSkills = new ArrayList<>();  // Adding skills for Tennis
        tennisSkills.add(skill5);
        tennisSkills.add(skill6);
        Sport tennis = new Sport(3, "Tennis", "A sport where players use rackets to hit a ball over a net", tennisSkills);

        ArrayList<Skill> swimmingSkills = new ArrayList<>();    // Adding skills for swimming
        swimmingSkills.add(skill7);
        swimmingSkills.add(skill8);
        Sport swimming = new Sport(4, "Swimming", "A sport where individuals race in water", swimmingSkills);

        // Create Students
        ArrayList<Sport> student1Interests = new ArrayList<>(); // Adding Sports to Student1 Interests
        student1Interests.add(basketball);
        student1Interests.add(swimming);
        Student student1 = new Student(1, "Abdullah", 20, student1Interests);

        ArrayList<Sport> student2Interests = new ArrayList<>(); // Adding Sports to Student2 Interests
        student2Interests.add(soccer);
        student2Interests.add(tennis);
        Student student2 = new Student(2, "Abdul Rehman", 22, student2Interests);

        ArrayList<Sport> student3Interests = new ArrayList<>(); // Adding Sports to Student3 Interests
        student3Interests.add(swimming);
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

        // Create Mentors
        ArrayList<Sport> mentor1Expertise = new ArrayList<>();  // Adding Sports Expertise of Mentor1
        mentor1Expertise.add(basketball);
        mentor1Expertise.add(swimming);
        Mentor mentor1 = new Mentor(1, "Coach Umair", 5, mentor1Expertise/*, new Student[]{student1, student2, student1, student2}*/);
        // Assigning Learners to Mentor1
//        mentor1.assignLearners(student1);
        mentor1.assignLearners(student3);
        mentor1.assignLearners(student2);   // todo: it should display error for non-matching sports of mentor & student

        ArrayList<Sport> mentor2Expertise = new ArrayList<>();  // Adding Sports Expertise of Mentor2
        mentor2Expertise.add(soccer);
        mentor2Expertise.add(tennis);
        Mentor mentor2 = new Mentor(2, "Coach Huzaifa", 2, mentor2Expertise/*, new Student[3]*/);
        // Assigning Learners to Mentor2
        mentor2.assignLearners(student2);
        mentor1.assignLearners(student3);
//        mentor1.assignLearners(student4);
        mentor1.assignLearners(student5);   // todo: it should display that 3rd student cant be assigned

        // Assign Students to Mentors
        // todo:

        // Display Skill details


        // Display Sport details


        // Display Student details


        // Display Mentor details


    }
}