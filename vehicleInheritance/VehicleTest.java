package vehicleInheritance;

/**
 * Tests the inheritance chain: Vehicle -> Car -> ElectricCar -> Tesla.
 */
public class VehicleTest {

    public static void main(String[] args) {

        // Test 1: a Tesla can use methods from ALL its ancestors
        System.out.println("---- Tesla ----");
        Tesla tesla = new Tesla(2026);
        tesla.displayInfo();       // overridden in Tesla (calls the whole chain)
        tesla.startEngine();       // inherited from Car
        tesla.chargeBattery();     // inherited from ElectricCar
        tesla.engageAutopilot();   // defined in Tesla

        // Test 2: polymorphism - parent reference, child object
        System.out.println("\n---- Polymorphism ----");
        Vehicle ref = new Tesla(2025);
        ref.displayInfo();         // Java runs Tesla's version of displayInfo()
        // ref.startEngine();      // compile error: Vehicle has no startEngine()

        // Test 3: a normal car
        System.out.println("\n---- Car ----");
        Car car = new Car("Toyota", 2020, 4);
        car.displayInfo();

        // Test 4: invalid data shows the validation messages
        System.out.println("\n---- Invalid Data ----");
        Vehicle bad = new Car("", 1500, 10);
        bad.displayInfo();
    }
}