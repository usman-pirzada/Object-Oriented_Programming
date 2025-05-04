package Q_07;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Book Library!");
        System.out.println("For how many books do you want store the details: ");
        int arrSize = sc.nextInt();
        Book[] book = new Book[arrSize];

        System.out.println("\nEnter details of the books below.");
        System.out.println();
        for (int i = 0; i < book.length; i++) {
            System.out.println("\n\tBook " + (i+1));

            sc.nextLine();
            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            book[i] = new Book(name, author, price);
        }
        System.out.println("Books Details Saved Successfully!");

        System.out.println("\nDo you want to display the saved details now? (y/n)");
        char ch = sc.next().charAt(0);

        if(ch == 'y' || ch == 'Y') {
            System.out.println("\nSee the saved details of the books below.");
            System.out.println();

            for (int i = 0; i < book.length; i++) {
                System.out.println("\n----------------------------------");
                System.out.println("\tBook " + (i+1));

                System.out.println("Book Name: " + book[i].getTitle());

                System.out.println("Author Name: " + book[i].getAuthor());

                System.out.println("Price: " + book[i].getPrice());
                System.out.println("----------------------------------");
            }
        }

        System.out.println("\nGood Bye!");
    }
}