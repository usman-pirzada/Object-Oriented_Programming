package Q_04;

public class Course {
    private String code;
    private String name;
    private int creditHours;

    // ****** Setters ******
    void setCode(String code) {
        this.code = code;
    }

    void setName(String name) {
        this.name = name;
    }

    void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    // ****** Getters ******
    String getCode() {
        return this.code;
    }

    String getName() {
        return this.name;
    }

    int getCreditHours() {
        return this.creditHours;
    }
}
