package Q_03;

import java.util.ArrayList;

public class User {
    private String name;
    private int userID;
    private int age;
    private String email;
    private String licenseType; // Leraners, Intermediate, Full License || Motorbyke, car
    private ArrayList<Vehicle> rentedVehicles = new ArrayList<>();

    // ******** Getters ********
    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getLicenseType() {
        return licenseType;
    }

    // ******** Setters ********
    public void setName(String name) {
        this.name = name;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    // ******** Methods ********
    boolean checkEligibility(Vehicle v) {   // todo: eligibility checker is not valid as it will not allow a Full Licensed to rent a Learner car
        return licenseType.equals(v.getLicenseRequired());
    }

    void rentVehicle(int vehicleNo, ArrayList<Vehicle> vehicles) {
        this.rentedVehicles.add(vehicles.get(vehicleNo));
        vehicles.remove(vehicleNo);

        System.out.println("Vehicle Rented Successfully!");
    }

    void returnRentedVehicle(int vehicleNo, ArrayList<Vehicle> vehicles) {
        vehicles.add(this.rentedVehicles.get(vehicleNo));
        this.rentedVehicles.remove(vehicleNo);

        System.out.println("Rented vehicle returned Successfully!");
    }

    public void viewRentedVehicles() {
        for (int i = 0; i < rentedVehicles.size(); i++) {
            System.out.println(" " + (i+1) + ") Type: " + rentedVehicles.get(i).getType() + ", Model: " + rentedVehicles.get(i).getModel() + ", Price: " + rentedVehicles.get(i).getPrice());
        }
    }

    void viewUserDetails() {
        System.out.println("ID: " + this.userID);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Email: " + this.email);
        System.out.println("License type: " + this.licenseType);
    }

    int get_no_of_RentedVehicles() {
        return this.rentedVehicles.size();
    }

    static boolean verifyID(int ID, ArrayList<User> users) {
        return ID <= users.size() && ID > 0;
    }
}