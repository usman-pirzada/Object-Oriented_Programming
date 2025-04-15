interface Payment {
    static void paymentPolicy() {
        System.out.println("Policy:");
        System.out.println("\tEnsure secure transactions for all payment methods.");
    }

    void pay(double amount);
    void getPaymentDetails();
}

class CreditCardPayment implements Payment {
    private double balance;
    private String paymentDetails;

    CreditCardPayment(double balance) {
        this.balance = balance;
    }

    public void pay(double amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Payment done successfully via Credit Card Payment!");
            paymentDetails = "Payment of $" + amount + " was done via Credit Card Payment";
        } else {
            System.out.println("Can't pay. Balance Insufficient!");
            if(paymentDetails == null) {
                paymentDetails = "No payments done yet via Credit Card Payment!";
            }
        }
    }

    public void getPaymentDetails() {
        System.out.println(paymentDetails);
    }
}

class PayPalPayment implements Payment {
    private double balance;
    private String paymentDetails;

    PayPalPayment(double balance) {
        this.balance = balance;
    }

    public void pay(double amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Payment done successfully via PayPal Payment!");
            paymentDetails = "Payment of $" + amount + " was done via PayPal Payment";
        } else {
            System.out.println("Can't pay. Balance Insufficient!");
            if(paymentDetails == null) {
                paymentDetails = "No payments done yet via PayPal Payment!";
            }
        }
    }

    public void getPaymentDetails() {
        System.out.println(paymentDetails);
    }
}

class BitcoinPayment implements Payment {
    private double balance;
    private String paymentDetails;

    BitcoinPayment(double balance) {
        this.balance = balance;
    }

    public void pay(double amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Payment done successfully via Bitcoin Payment!");
            paymentDetails = "Payment of $" + amount + " was done via Bitcoin Payment";
        } else {
            System.out.println("Can't pay. Balance Insufficient!");
            if(paymentDetails == null) {
                paymentDetails = "No payments done yet via Bitcoin Payment!";
            }
        }
    }

    public void getPaymentDetails() {
        System.out.println(paymentDetails);
    }
}

public class Task_07 {
    public static void main(String[] args) {

        CreditCardPayment creditPayment = new CreditCardPayment(500);
        PayPalPayment paypal = new PayPalPayment(1000);
        BitcoinPayment bitcoin = new BitcoinPayment(50);

        creditPayment.pay(150);
        paypal.pay(250);
        bitcoin.pay(465);

        System.out.println();

        Payment[] payments = {creditPayment, paypal, bitcoin};
        System.out.println("Payment Details:");
        for(Payment payment : payments) {
            System.out.print("\t-");
            payment.getPaymentDetails();
        }
    }
}