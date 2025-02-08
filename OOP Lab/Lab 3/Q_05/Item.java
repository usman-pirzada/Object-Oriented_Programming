package Q_05;

import java.util.Scanner;
import java.util.ArrayList;

public class Item {
    String itemName;
    int id;

    // Stock Attributes
    private float price;
    private int stockQuantity;

    // Purchase Attributes
    static ArrayList<String> itemsInCard = new ArrayList<>();
    static ArrayList<Integer> purchasedQty = new ArrayList<>();
    static ArrayList<Float> purchasedPrice = new ArrayList<>();

    // ******* Setters *******

    void setPrice(float price) {
        this.price = price;
    }

    void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    Item(int id, String itemName, int stockQuantity, float price) {     // Constructor
        this.id = id;   // todo: If want auto id assignment, can be by sizeof the items arraylist. if its size=2, then id=3
        this.itemName = itemName;
        this.stockQuantity = stockQuantity;
        this.price = price;
    }

    // ******** Getters ********
    float getPrice() {
        return this.price;
    }

    int getStockQuantity() {
        return this.stockQuantity;
    }

    // ****** Methods *******
    static int searchItem(String searchName, ArrayList<Item> items) {     // Search by Name
        int foundIndex = -1;

        for(int i=0; i<items.size(); i++) {
            if(items.get(i).itemName.equalsIgnoreCase(searchName)) {
                foundIndex = i;
            }
        }
        return foundIndex;
    }
    static int searchItem(int searchId, ArrayList<Item> items) {     // Search by ID
        int foundIndex = -1;

        for(int i=0; i<items.size(); i++) {
            if(items.get(i).id == searchId) {
                foundIndex = i;
            }
        }
        return foundIndex;
    }

    void displayItemDetails(Item item) {    // todo:
        System.out.println(item.id);
        System.out.println(item.getPrice());
    }

    static void displayStockedItems(ArrayList<Item> items) {    // List All Items with their Qty & Price
        System.out.println("Item # |\t Name\t|\t Qty\t| Price");
        System.out.println("------  \t ----\t\t ---\t -----");
        System.out.println();
        for(int i=0; i<items.size(); i++) {
            System.out.print(" " + (i+1) + ") ");
            System.out.printf("%15s %8d %10f", items.get(i).itemName, items.get(i).stockQuantity, items.get(i).price);
            System.out.println();
        }
    }

    void purchase() {

    }
    static void purchase(int id, ArrayList<Item> items) {

    }
    static void purchase(String itemName, ArrayList<Item> items) {

    }

    static void generateBill(ArrayList<Item> items) {
        float tot_price = 0;

        System.out.println();
        System.out.println("\t *************** Bill ***************");
        System.out.println("Item # |\t Name\t|\t Qty\t| Price");
        System.out.println("------  \t ----\t\t ---\t -----");
        System.out.println();
        for(int i=0; i<Item.itemsInCard.size(); i++) {
            // Print List of purchased items with qty & price
            System.out.print(" " + (i+1) + ") ");
            System.out.printf("%15s %8d %10f", Item.itemsInCard.get(i), Item.purchasedQty.get(i), Item.purchasedPrice.get(i));
            System.out.println();

            // Total price calculation
            tot_price += (Item.purchasedPrice.get(i) * Item.purchasedQty.get(i));
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total Items Purchased: " + Item.itemsInCard.size());
        System.out.println("Total Amount to Pay: " + tot_price);
        System.out.println("*****************************************");
    }

    void updateStock(Scanner sc) {  // todo:
        int itemsNum = sc.nextInt();    // -1 to remain same
        float price = sc.nextFloat();

        this.setPrice(price);
        this.setStockQuantity(itemsNum);
        System.out.println("\nStock updated successfully");
    }
}