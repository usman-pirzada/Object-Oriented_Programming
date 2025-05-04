class Project {
    private static int projectsCount;
    final String deadline;

    Project(String deadline) {
        this.deadline = deadline;
        this.projectsCount++;
    }

    static void displayProjectsCount() {
        System.out.println("Total Projects Created: " + projectsCount);
    }
}

public class Q_08_Static_and_Final {
    public static void main(String[] args) {
        
        Project project1 = new Project("2023-12-31");
        Project project2 = new Project("2024-06-30");
        Project project3 = new Project("2024-09-15");

        Project.displayProjectsCount();
        System.out.println("Project 1 Deadline: " + project1.deadline);
        System.out.println("Project 2 Deadline: " + project2.deadline);
        System.out.println("Project 3 Deadline: " + project3.deadline);
    }
}
