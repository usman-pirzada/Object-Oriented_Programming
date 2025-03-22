class Vehicle {
    String brand;
    int model;

    Vehicle(String brand, int model) {
        this.brand = brand;
        this.model = model;
    }

    void showDetails() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    int noOfSeats;

    Car(String brand,int model, int noOfSeats) {
        super(brand, model);
        this.noOfSeats = noOfSeats;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("No. of Seats: " + noOfSeats);
        System.out.println();
    }
}

class Bike extends Vehicle {
    int engineCapacity;

    Bike(String brand, int model, int engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println();
    }
}

public class Task06_InheritanceAndSUPERkeyword {
    public static void main(String[] args) {
        
        Car c = new Car("Toyota", 2020, 5);
        Bike b = new Bike("Suzuki", 2015, 70);

        c.showDetails();
        b.showDetails();

    }
}
