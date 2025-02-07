package Q_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Temperature temp = new Temperature();

        while (true) {
            System.out.println("\nWelcome to Weather Monitering System!");
            System.out.println("Enter a number to select an option:");
            System.out.println("1) Store temperature");
            System.out.println("2) Modify Temperatures");
            System.out.println("3) Display Original & Modified Tempeartures");
            System.out.println("4) Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    temp.storeTemp(sc);
                    System.out.println("Temperature values stored successfully!");
                    break;

                case 2:
                    System.out.println("By how much value do you want to increase all the temperature records?");
                    float value = sc.nextFloat();
                    temp.increaseTemp(value);
                    break;

                case 3:
                    temp.displayTemp();
                    break;

                case 4:
                    System.out.println("Good Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Input!! Try Again.");
            }
        }
    }
}