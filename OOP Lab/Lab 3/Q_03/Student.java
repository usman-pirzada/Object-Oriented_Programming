package Q_03;

public class Student {
    String name;
    String jobRole;
    String[] skills = new String[3];

    public String toString() {
        return ("Name: " + name + "\nJob Role: " + jobRole + "\nSkills: " + skills[0] + ", " + skills[1] + ", " + skills[2]);
    }
}