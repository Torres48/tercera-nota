package unidad3;

abstract class AbstractVehicle {
    int wheels;
    String fuelType;

    public abstract void startEngine();
}

class Car extends AbstractVehicle {
    public Car() {
        this.wheels = 4;
        this.fuelType = "Gasoline";
    }

    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting...");
    }
}

public class Vehicle {
    public static void main(String[] args) throws Exception {
        Car myCar = new Car();
        System.out.println("The car has " + myCar.wheels + " wheels.");
        myCar.startEngine();
    }
}