import java.util.ArrayList;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Float> priceList = new ArrayList<>();

        System.out.println("Start entering your items & prices to generate receipt (Enter \"done\" in items to terminate)");
        while(true) {
            System.out.print("Enter your Item: ");
            String item = sc.nextLine();

            if(item.equalsIgnoreCase("done")) break;

            itemList.add(item);

            System.out.print("Enter its price: ");
            float price = sc.nextFloat();
            priceList.add(price);
            sc.nextLine();
        }

        System.out.println("\n*******************************************");
        System.out.println("\t\t Invoice");
        System.out.println("*******************************************");
        System.out.println("Itemized List:");
        for (int i = 0; i < priceList.size(); i++) {
            System.out.println((i+1) + ". " + itemList.get(i) + "\t" + priceList.get(i));
        }

        System.out.print("How much % discout do you want to apply: ");
        float discount = sc.nextFloat();

        float tot_Amount = 0.00F;
        for(float price: priceList) {
            tot_Amount += price;
        }

        float disAmount = tot_Amount/100 * discount;

        System.out.println("--------------------------------------");

        System.out.println("Subtotal: \t" + tot_Amount);
        System.out.println("Discount Percent: \t" + discount + "%");
        System.out.println("Discount Amount: \t" + disAmount);

        System.out.println("--------------------------------------");

        System.out.println("Total Before tax: \t" + (tot_Amount-disAmount));
        System.out.println("Sales Tax (5%):" + ((tot_Amount-disAmount)/100 * 5));

        System.out.println("--------------------------------------");

        System.out.println("Invoice Total: \t" + (tot_Amount-disAmount - ((tot_Amount-disAmount)/100 * (tot_Amount-disAmount)/100 * 5)));

        System.out.println("**************************************");
        System.out.println("Thank you for shopping with us!");
        System.out.println("**************************************");
    }
}