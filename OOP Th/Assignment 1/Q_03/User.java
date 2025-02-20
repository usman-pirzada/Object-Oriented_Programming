package Q_03;

public class User {
    private int userID;
    private int age;
    private String email;
    private String licenseType; // Leraners, Intermediate, Full License || Motorbyke, car

    // ******** Getters ********
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