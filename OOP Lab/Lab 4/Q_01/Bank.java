package Q_01;

public class Bank {
    private String customerName;
    private int accountNo;
    private double balance;

    Bank() {    // Default Constructor
        this.customerName = "Default";
        this.accountNo = 0000;
        this.balance = 0.0;
    }

    Bank(String customerName, int accountNo, double balance) {    // Parameterized constructor
        this.customerName = customerName;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    @Override
    protected void finalize() {
        System.out.println("\nAccount " + accountNo + " has been deleted successfully!");
    }

    @Override
    public String toString() {
        return "\nCustomer Name: " + customerName + "\nAccount No: " + accountNo + "\nCurrent Balance: " + balance;
    }
}