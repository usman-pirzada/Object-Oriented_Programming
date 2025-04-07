package ConstructorChaining;

class Vehicle {
    private String name;
    private String model;
    private int year;

    public Vehicle(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public Vehicle(String name, String model) {
        this(name, model, 2024);
    }

    public Vehicle() {
        this("Unknown", "Unknown", 2024);
    }

    void displayInfo() {
        System.out.println("Vehicle: " + this.name + " " + this.model + " (" + this.year + ")");
    }
}
