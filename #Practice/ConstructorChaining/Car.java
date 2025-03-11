package ConstructorChaining;

public class Car extends Vehicle {
    boolean isConvertible;

    public Car(String name, String model, int year, boolean isConvertible) {
        super(name, model, year);
        this.isConvertible = isConvertible;
    }

    public Car() {
        super();
        this.isConvertible = false;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Convertible: " + ((this.isConvertible)? "Yes" : "No"));
    }
}
