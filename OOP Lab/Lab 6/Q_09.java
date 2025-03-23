import java.util.ArrayList;

class Customer {
    String name;
    ArrayList<Subscription> subscriptions;

    Customer(String name) {
        this.name = name;
        this.subscriptions = new ArrayList<>();
    }

    void addSubscription(Subscription subscription) {
        this.subscriptions.add(subscription);
        ++Subscription.subscriptionCount;
        System.out.println("Subscription added successfully!");
    }

    void cancelSubscription(Subscription subscription) {
        if (this.subscriptions.remove(subscription)) {
            --Subscription.subscriptionCount;
            System.out.println("Subscription removed successfully!");
        } else {
            System.out.println("Subscription not found!");
        }
    }

    void printDetails() {
        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + this.name);
        System.out.println("\nActive Subscriptions:");
        for (Subscription sub : subscriptions) {
            sub.printDetails();
        }
    }
}

class Subscription {
    int id;
    String name;
    Plan plan;

    static int subscriptionCount = 0;

    Subscription(String name, int id, Plan plan) {
        this.name = name;
        this.id = id;
        this.plan = plan;
    }

    void printDetails() {
        System.out.println("Subscription ID: " + this.id);
        System.out.println("Subscription Name: " + this.name);
        System.out.println("Plan Type: " + this.plan.type);
        System.out.println("Plan Price: $" + this.plan.getPrice());
    }
}

class Plan {
    String type;
    private final double price;

    Plan(String type, double price) {
        this.type = type;
        this.price = price;
    }

    double getPrice() {
        return this.price;
    }
}

public class Q_09 {
    public static void main(String[] args) {
        
        Plan basicPlan = new Plan("Basic", 9.99);
        Plan proPlan = new Plan("Pro", 19.99);
        Plan enterprisePlan = new Plan("Enterprise", 29.99);

        Customer c1 = new Customer("Ahmad");

        Subscription sub1 = new Subscription("Microsoft 365", 65488, basicPlan);
        Subscription sub2 = new Subscription("Windows 10", 9874, proPlan);
        Subscription sub3 = new Subscription("Norton Antivirus", 75452, enterprisePlan);

        c1.addSubscription(sub3);
        c1.addSubscription(sub1);
        System.out.println("Total Active subscriptions: " + Subscription.subscriptionCount);
        c1.printDetails();
    }
}