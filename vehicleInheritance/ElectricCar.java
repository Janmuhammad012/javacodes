package vehicleInheritance;

/**
 * An electric car is a car with a battery.
 * Child of Car, parent of Tesla.
 */
public class ElectricCar extends Car {

    // Instance field (in kWh): it belongs to the object
    private int batteryCapacity;

    public ElectricCar(String brand, int year, int numOfDoors, int batteryCapacity) {
        super(brand, year, numOfDoors);
        this.setBatteryCapacity(batteryCapacity);
    }

    public void chargeBattery() {
        System.out.println("Battery capacity: " + this.batteryCapacity + " kWh");
        System.out.println("Battery charged.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery: " + this.batteryCapacity + " kWh");
    }

    // Capacity must be greater than 0, otherwise 100 is used
    public void setBatteryCapacity(int batteryCapacity) {
        if (batteryCapacity > 0) {
            this.batteryCapacity = batteryCapacity;
        } else {
            System.out.println("Invalid battery capacity.");
            this.batteryCapacity = 100;
        }
    }

    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }
}