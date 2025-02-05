package Q_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Stadium> stadiums = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int matchNo = 0;

        while (true){
            System.out.println("\nSelect an option to proceed:");
            System.out.println("1) Schedule a Match");
            System.out.println("2) Display details about scheduled matches");
            System.out.println("3) Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    stadiums.add(new Stadium());
                    stadiums.get(matchNo).scheduleMatch();
                    matchNo++;
                    break;

                case 2:
                    if(matchNo == 0) {
                        System.out.println("\nNo matches scheduled yet!!");
                        break;
                    }

                    System.out.println("------------------------------------");
                    for (int i=0; i<matchNo; i++) {
                        System.out.println("\n\tMatch " + (i+1));
                        stadiums.get(i).displayDetails();
                    }
                    System.out.println("\nTotal scheduled matches: " + Stadium.matchesScheduled);
                    System.out.println("------------------------------------");

                    break;

                case 3:
                    System.out.println("ThankYou for using this program. Good Bye!");
                    return;

                default:
                    System.out.println("Invalid Input!! Try Again.");
            }

        }
    }
}