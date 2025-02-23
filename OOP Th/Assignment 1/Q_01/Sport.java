package Q_01;

import java.util.ArrayList;

public class Sport {

    private int id;
    private String name;
    private String description;
    private ArrayList<Skill> requiredSkills;

    Sport(int id, String name, String description, ArrayList<Skill> requiredSkills) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.requiredSkills = requiredSkills;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }

    // ***** Getter *****
    public String getName() {
        return name;
    }

    // ***** Methods *****
    void addSkill(Skill s) {    // Add new Skill
        this.requiredSkills.add(s);
    }

    void removeSkill(Skill s) { // Remove a Skill
        if(this.requiredSkills.contains(s)) {
            this.requiredSkills.remove(s);
            System.out.println("Skill \"" + s + "\" removed from the Sport \"" + this + "\"  successfully!");
        } else {
            System.out.println("Unable to remove the skill \"" + s + "\", as it does not exist in the Sport \"" + this + "\"!");
        }
    }

    void showSportDetails() {   // Show a Skill's Details
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.print("Skills Required: ");
        if(this.requiredSkills.isEmpty()) {
            System.out.println("No Required Skills added yet!");
            return;
        }
        for (int i = 0; i < requiredSkills.size(); i++) {
            System.out.print(requiredSkills.get(i));
            if (i < requiredSkills.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}