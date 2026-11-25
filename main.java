class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is moving on the road.");
    }
}

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.start();
        myCar.drive();
    }
}
