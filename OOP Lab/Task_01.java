abstract class Bank {
    double balance = 0;

    abstract void getBalance();
}

class BankA extends Bank {

    void getBalance() {
        System.out.println("The balance of BankA is: $" + balance);
    }

    BankA(double balance) {
        this.balance = balance;
    }
}

class BankB extends Bank {

    void getBalance() {
        System.out.println("The balance of BankB is: $" + balance);
    }

    BankB(double balance) {
        this.balance = balance;
    }
}

class BankC extends Bank {

    void getBalance() {
        System.out.println("The balance of BankC is: $" + balance);
    }

    BankC(double balance) {
        this.balance = balance;
    }
}

public class Task_01 {
    public static void main(String[] args) {

        BankA bankA = new BankA(100);
        bankA.getBalance();

        BankB bankB = new BankB(150);
        bankB.getBalance();

        BankC bankC = new BankC(200);
        bankC.getBalance();
    }
}