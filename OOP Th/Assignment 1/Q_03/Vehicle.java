package Q_03;

import java.util.ArrayList;

public class Vehicle {
    private String name;
    private int model;
    private double price;
    private String licenseRequired; // todo:
    private String condition;   // new, old, ac, non-ac, etc
    private String type;    // manual, auto, hybrid, electrical

    Vehicle(String name, int model, double price, String licenseRequired, String condition, String type) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.licenseRequired = licenseRequired;
        this.condition = condition;
        this.type = type;
    }

    // ***** Methods *****
    static void viewVehicles(ArrayList<Vehicle> vehicles) {
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(" " + (i+1) + ") Name: " + vehicles.get(i).name + ", Model: " + vehicles.get(i).model);
        }
    }

    void displayRentalDetails() {   // Display the rental details and the vehicle selected
        System.out.println("Name: " + name + ", Model: " + model + ", Rent Price: " + price + ", License Required: " + licenseRequired + ", Condition: " + condition + ", Type: " + type);
    }

    public String getName() {
        return name;
    }

    public int getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getLicenseRequired() {
        return licenseRequired;
    }

    public String getCondition() {
        return condition;
    }

    public String getType() {
        return type;
    }

    static boolean verifyVehicleNo(int vehicleNo, ArrayList<Vehicle> vehicles) {
        return vehicleNo <= vehicles.size() && vehicleNo > 0;
    }
}