class Bank {
    private final String name = "Secure Bank";

    void showBankDetails() {
        System.out.println("Bank Name: " + name);
    }
}

final class SecureTransaction {

    void processTransaction() {
        System.out.println("Transaction Processed Securely");
    }

}

class Account extends Bank {
    private final int accountNo;
    private static int accountsCount = 0;

    Account() {
        accountsCount++;
        accountNo = accountsCount;
    }

    void showAccountDetails() {
        System.out.println("Account Number: " + accountNo);
    }

    final void calculateInterest() {
        System.out.println("Calculating Interest...");
    }
}

class SavingsAccount extends Account {
    // void calculateInterest() {
    // }

    void displaySavingsAccountDetails() {
        System.out.println("Saving Account");
    }
}

public class Task08_BankingSystem {
    public static void main(String[] args) {
        
        Account a = new Account();

        a.showAccountDetails();
        a.calculateInterest();

        SecureTransaction s = new SecureTransaction();

        s.processTransaction();

    }
}
