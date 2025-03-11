package ConstructorChaining;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2025);
        Car car = new Car("Ford", "Mustang", 2021, true);

        Vehicle defaultVehicle = new Vehicle();
        Car defaultCar = new Car();

        vehicle.displayInfo();
        car.displayInfo();
        defaultVehicle.displayInfo();
        defaultCar.displayInfo();
    }
}
