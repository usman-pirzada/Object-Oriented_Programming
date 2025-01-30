import java.util.ArrayList;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();

        System.out.println("Enter items in your to-do List: (Enter DONE to stop inputting)");
        while(true) {
            String item = sc.nextLine();
            if(item.equals("DONE")) break;
            toDoList.add(item);
        }

        System.out.println("Your to-do List is as follows:");
        for(String item: toDoList) {
            System.out.println(item);
        }
    }
}