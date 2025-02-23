package Q_01;

public class Skill {

    private int id;
    private String name;
    private String description;

    Skill(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {  // todo:
        return name + " (" + id + ")";
    }

    // ***** Methods *****
    void showSkillDetails() {   // Show a Skill's Details
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
    }

    void updateSkillDescription(String newDescription) {    // Update Skill Description
        this.description = newDescription;

        System.out.println("Description of \"" + this + "\" skill updated successfully!");
    }
}