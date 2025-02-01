import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char proceed;

        do{
            String[] books = new String[5];

            System.out.println("Enter the titles of 5 books being borrowed:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Book " + (i+1) + ": ");
                books[i] = sc.nextLine();

                if(books[i].isBlank()) {
                    System.out.println("\n Book title can not be empty. Enter again: ");
                    i--;
                }
            }
            
            System.out.println("\nLIBRARY RECEIPT");
            System.out.println("Borrowed Books:");
            for (int i = 0; i < 5; i++) {
                System.out.println((i+1) + ". " + books[i]);
            }

            System.out.println("\nHow many of the borrowed books are still overdue?");

            int overdueBooks = 0;

            while (true) { 
                overdueBooks = sc.nextInt();
                sc.nextLine(); // consume the newline character
                if(overdueBooks <= 5 && overdueBooks >= 0) break;
                
                System.out.println("Invalid Input! Enter Again: ");
            }

            int overdueFine = overdueBooks * 2;

            System.out.println("Fine for overdue books (@ $2.00 per day): $" + overdueFine);

            System.out.println("\nContinue for another user? (y/n)");
            proceed = sc.next().charAt(0);

        } while(proceed == 'y' || proceed == 'Y');

    }
}
