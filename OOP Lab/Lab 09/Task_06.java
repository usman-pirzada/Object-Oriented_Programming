import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();
}

class SavingsAccount implements BankAccount {
    private double balance = 0;

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount deposited successfully!");
    }

    public void withdraw(double amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount withdrawn successfully!");
        } else {
            System.out.println("Can't withdraw. Balance Insufficient!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingsAccount savingsAccount = new SavingsAccount();

        while (true) {
            // Display menu to the user
            System.out.println("\nBank Account Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Get Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            switch(scanner.nextInt()) {
                case 1: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    savingsAccount.deposit(scanner.nextDouble());
                    break;
                case 2: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    savingsAccount.withdraw(scanner.nextDouble());
                    break;
                case 3: // Display balance
                    System.out.println("\nCurrent balance: " + savingsAccount.getBalance());
                    break;
                case 4: // Exit
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}