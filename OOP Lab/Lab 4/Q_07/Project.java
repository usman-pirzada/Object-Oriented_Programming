package Q_07;

public class Project {
    String name;
    String deadline;
    double budget;

    // Default constructor
    Project() {
        this.name = "Untitled Project";
        this.deadline = "Not Assigned";
        this.budget = 0.0;
    }

    // Parameterized Constructors
    Project(String name, String deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    Project(String name, String deadline, double budget) {
        this.name = name;
        this.deadline = deadline;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Project Created: " + name + ", Deadline: " + deadline + "Budget: $" + budget;
    }
}