package Q_01;
import java.util.ArrayList;

public class Sport {

    // ***** Attributes *****
    int id;
    String name;
    String description;
    ArrayList<Skill> requiredSkills = new ArrayList<>();

    Sport(int id, String name, String description, ArrayList<Skill> requiredSkills) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.requiredSkills = requiredSkills;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "Name: " + name +
                "Description: " + description +
                "Required " + requiredSkills.toString();
    }

    // ***** Methods *****
    void addSkill(Skill s) {    // Add new Skill

    }

    void removeSkill(Skill s) { // Remove a Skill

    }
}