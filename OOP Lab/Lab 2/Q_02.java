import java.util.ArrayList;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();

        System.out.println("Enter items in your to-do List: (Enter DONE to stop inputting)");
        while(true) {
            String item = sc.nextLine();
            if(item.equalsIgnoreCase("DONE")) break;
            toDoList.add(item);
        }

        System.out.println("\nYour to-do List is as follows:");
        for(String item: toDoList) {
            System.out.println(item);
        }

        int index;

        while (true) { 
            System.out.print("\nEnter Item Number to remove: ");
            index = sc.nextInt();
            index--;

            if(index < toDoList.size()) break;
            System.out.println("Invalid Item No.!");
        }
    
        System.out.println("\nUpdated To-Do List after removing \"" + toDoList.get(index) + "\":");
        toDoList.remove(index);

        for(String item: toDoList) {
            System.out.println(item);
        }
    }
}