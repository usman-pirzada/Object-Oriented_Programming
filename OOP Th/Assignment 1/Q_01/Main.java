package Q_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create Skills
        Skill skill1 = new Skill(1, "Dribbling", "Ability to control the ball while running");
        Skill skill2 = new Skill(2, "Shooting", "Ability to shoot the ball accurately");
        Skill skill3 = new Skill(3, "Passing", "Ability to pass the ball to teammates");
        Skill skill4 = new Skill(4, "Tackling", "Ability to take the ball from opponents");

        // Create Sports
        ArrayList<Skill> basketballSkills = new ArrayList<>();
        basketballSkills.add(skill1);
        basketballSkills.add(skill2);
        basketballSkills.add(skill3);
        Sport basketball = new Sport(1, "Basketball", "A team sport where players try to score by shooting a ball through a hoop", basketballSkills);

        ArrayList<Skill> soccerSkills = new ArrayList<>();
        soccerSkills.add(skill1);
        soccerSkills.add(skill3);
        soccerSkills.add(skill4);
        Sport soccer = new Sport(2, "Soccer", "A team sport where players try to score by kicking a ball into a goal", soccerSkills);

        // Create Students
        ArrayList<Sport> student1Interests = new ArrayList<>();
        student1Interests.add(basketball);
        Student student1 = new Student(1, "John Doe", 20, student1Interests);

        ArrayList<Sport> student2Interests = new ArrayList<>();
        student2Interests.add(soccer);
        Student student2 = new Student(2, "Jane Smith", 22, student2Interests);

        // Create Mentors
        ArrayList<Sport> mentor1Expertise = new ArrayList<>();
        mentor1Expertise.add(basketball);
        Mentor mentor1 = new Mentor(1, "Coach Carter", 5, mentor1Expertise, new Student[5]);

        ArrayList<Sport> mentor2Expertise = new ArrayList<>();
        mentor2Expertise.add(soccer);
        Mentor mentor2 = new Mentor(2, "Coach Taylor", 3, mentor2Expertise, new Student[3]);

        // Assign Students to Mentors
        mentor1.assignLearners(student1);
        mentor2.assignLearners(student2);

        // Display Mentor and Student details
        System.out.println("Mentor 1: " + mentor1.getName());
        mentor1.viewLearners();

        System.out.println("Mentor 2: " + mentor2.getName());
        mentor2.viewLearners();

        System.out.println(student1);
        System.out.println(mentor1);
        System.out.println(skill1);
        System.out.println(soccerSkills);
    }
}