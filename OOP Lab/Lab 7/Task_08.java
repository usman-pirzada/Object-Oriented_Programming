class Bank {
    private final String name = "Secure Bank";
    private final int accountNo;
    private static int accountsCount = 0;


    Bank() {
        accountsCount++;
        this.accountNo = accountsCount;
    }

    void showBankDetails() {
        System.out.println(name);
    }
}

final class SecureTransaction {
    void processTransaction() {
        System.out.println("Transaction Processed Securely");
    }
}

class Account {
    private static int accountsCount = 0;
    private final int accountNo;

    Account() {
        accountsCount++;
        accountNo = accountsCount;
    }

    void showAccountDetails() {
        System.out.println("Account Number: " + accountNo);
    }

    final void calculateSalary() {
        System.out.println();
    }
}

class SavingsAccount {
    void calculateSalary() {
    }

    void displaySavingsAccountDetails() {

    }
}

public class Task_08 {
    public static void main(String[] args) {
        
    }
}
