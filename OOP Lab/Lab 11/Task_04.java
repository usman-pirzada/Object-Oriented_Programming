import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Project {
    static final String filename = "project.txt";

    String name;
    String startDate;
    String projectManager;

    Project(String name, String startDate, String projectManager) {
        this.name = name;
        this.startDate = startDate;
        this.projectManager = projectManager;
    }

    static void readProjectDetails() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeProjectDetails(Project project) {
        try {
            FileWriter writer = new FileWriter(filename, true);

            writer.write("Name: " + project.name + "\n");
            writer.write("Start Date: " + project.startDate + "\n");
            writer.write("Project Manager: " + project.projectManager + "\n");
            writer.write("\n");  // Add a blank line after all attributes

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Task_04 {
    public static void main(String[] args) {

        Project.writeProjectDetails(new Project("Hamza", "2-May-2025", "Huzaifa"));
        Project.writeProjectDetails(new Project("Hamza", "2-May-2025", "Huzaifa"));
        Project.writeProjectDetails(new Project("Hamza", "2-May-2025", "Huzaifa"));
        
        Project.readProjectDetails();

    }
}
