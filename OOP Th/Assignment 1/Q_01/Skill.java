package Q_01;

public class Skill {

    // ***** Attributes *****
    int id;
    String name;
    String description;

    Skill(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nName: " + name +
                "\nDescription: " + description;
    }

    // ***** Methods *****
    void showSkillDetails() {   // Show a Skill's Details

    }

    void updateSkillDescription(String newDescription) {    // Update Skill Description

    }
}