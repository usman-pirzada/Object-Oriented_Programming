class Engine {
    int horsePower;
    String fuelType;
    int capacity;   // seating capacity

    Engine(int horsePower, String fuelType, int capacity) {
        this.horsePower = horsePower;
        this.fuelType = fuelType;
        this.capacity = capacity;
    }
}

class Car {
    String brand;
    int model;
    String chassisNo;
    Engine engine;

    Car(String brand, int model, String chassisNo, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.chassisNo = chassisNo;
        this.engine = engine;
    }

    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Chassis No: " + chassisNo);
        System.out.println("Engine HorsePower: " + engine.horsePower);
        System.out.println("Fuel Type: " + engine.fuelType);
        System.out.println("Seating Capacity: " + engine.capacity);
    }
}

public class Q_01 {
    public static void main(String[] args) {
        
        Engine engine = new Engine(150, "Petrol", 5);
        Car car = new Car("Toyota", 2023, "CH12345", engine);

        car.displayDetails();
    }
}