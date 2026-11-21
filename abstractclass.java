abstract class Vehicle {  // 1. create an abstract class
    // 2. ENCAPSULATION: Keeping data private and exposing it via methods
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
  // Abstract method (must be implemented by child classes)
    abstract void start();
}

// 3. INHERITANCE: 'Car' acquires properties and methods from 'Vehicle'
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    // 4. POLYMORPHISM (Overriding): Providing a specific implementation of start()
    @Override
    void start() {
        System.out.println(getBrand() + " car starts with a key.");
    }
}

class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(getBrand() + " bike starts with a button.");
    }
}

// Main class to run the code
public class Main {
    public static void main(String[] args) {
        // Creating objects (instances of classes)
        Vehicle myCar = new Car("Toyota");
        Vehicle myBike = new Bike("Yamaha");

        myCar.start();   // Output: Toyota car starts with a key.
        myBike.start();  // Output: Yamaha bike starts with a button.
    }
}
