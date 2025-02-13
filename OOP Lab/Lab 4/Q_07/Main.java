package Q_07;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Folio Software House");

        System.out.println("\nCreating Projects at Folio...");

        Project p1 = new Project();
        System.out.println("Default " + p1);

        Project p2 = new Project("AI Chatbot", "30th june 2025");
        System.out.println(p2);

        Project p3 = new Project("E-Commerse Platform", "15th Dec 2025", 50000.0);
        System.out.println(p3);
    }
}