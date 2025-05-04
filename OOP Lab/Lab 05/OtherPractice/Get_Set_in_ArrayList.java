package OtherPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Set_in_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> fruits = new ArrayList<>();

        System.out.println("How many fruit names do you want to enter in the ArrayList: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Fruit name #" + (i+1) + ": ");
            fruits.add(sc.next());
        }

        System.out.println("\nYour ArrayList:");
        for (int i = 0; i < n; i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("Enter a fruit name to replace the already existing name at position #" + fruits.size());
        fruits.set((fruits.size() - 1), sc.next());

        System.out.println("\nNow Your ArrayList:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
    }
}