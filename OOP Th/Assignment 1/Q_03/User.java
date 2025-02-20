package Q_03;

import java.util.ArrayList;

public class User {
    private String name;
    private int userID;
    private int age;
    private String email;
    private String licenseType; // Leraners, Intermediate, Full License || Motorbyke, car

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
    void rentVehicle(int vehicleNo) {

    }

    void checkEligibility() {

    }
}