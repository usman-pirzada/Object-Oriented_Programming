class Task {

    /*
     * Method Overloading
     */

    void addTask(String taskName, String deadline) {
        System.out.println("New task with Task Name and Deadline added successfully!");
    }

    void addTask(String taskName, String deadline, int priorityLevel) {
        System.out.println("New task with Task Name, Deadline and Priority Level added successfully!");
    }

    void addTask(String taskName, int priorityLevel, int estm_completion_time_in_hrs) {
        System.out.println("New task with Task Name, Priority level and Estimated completion time added successfully!");
    }
}

class SoftwareEngineer {
    void assignTask(Task task) {
        System.out.println("Task assigned to the Software Engineer successfully!");
    }
}

class TeamLead extends SoftwareEngineer {

    /*
     * Method Overriding
     */

    @Override
    void assignTask(Task task) {
        System.out.println("Team Lead has reviewed and approved the task successfully!");
    }
}

class ProjectManager extends TeamLead {

    /*
     * Method Overriding
     */

    @Override
    void assignTask(Task task) {
        System.out.println("Task Assignment rules have been override and assigned with custom deadlines by the Project Manager!");
    }
}

public class Q_06 {
    public static void main(String[] args) {
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();

        // Use method overloading to add tasks
        task1.addTask("Design Module", "2025-03-30");
        task2.addTask("Develop Module", "2025-04-10", 2);
        task3.addTask("Test Module", 1, 5);

        System.out.println();
        
        // Create objects for different roles
        SoftwareEngineer engineer = new SoftwareEngineer();
        TeamLead lead = new TeamLead();
        ProjectManager manager = new ProjectManager();

        // Use method overriding to assign tasks
        engineer.assignTask(task1); // Software Engineer assigns the task
        lead.assignTask(task2);     // Team Lead reviews and assigns the task
        manager.assignTask(task3);  // Project Manager customizes and assigns the task
    }
}