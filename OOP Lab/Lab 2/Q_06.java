import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String USERNAME = "Usman";
        final String PASSWORD = "abc123";

       System.out.print("Enter username: ");
       String username = sc.nextLine();
       System.out.print("Enter password: ");
       String password = sc.nextLine();
       if(!username.equals(USERNAME) || !password.equals(PASSWORD)) {
           System.out.println("\n\tInvalid Credentials!!");
           return;
       }

        System.out.println("Login Successfil! Welcome, " + username + "!");

        double balance = 0;
        char value = 'Y';

        do {
            System.out.println("\n*************************************");
            System.out.println("\t Welcome to Bank of Pakistan");
            System.out.println("*************************************");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Account Status");
            System.out.println("*************************************");
            System.out.print("Select your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Amount deposited successfully! New Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if(withdraw > balance) {
                        System.out.println("Amount exceeded the current balance!");
                        break;
                    }

                    balance -= withdraw;
                    System.out.println("Amount withdrawn successfully! New Balance: " + balance);
                    break;

                case 3:
                    System.out.println("\tAccount Status:");
                    System.out.println("Username: " + username);
                    System.out.println("Current Balance: " + balance);
                    break;

                default:
                    System.out.println("Invalid Input!");
            }

            System.out.print("\nDo you want to continue? [y/Y]: ");
            value = sc.next().charAt(0);
        } while(value == 'y' || value == 'Y');

        System.out.println("ThankYou for banking with us. Goodbye!");
    }
}