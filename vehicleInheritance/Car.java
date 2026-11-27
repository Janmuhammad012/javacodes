package vehicleInheritance;

/**
 * A car is a vehicle that has doors and an engine.
 * Child of Vehicle, parent of ElectricCar.
 */
public class Car extends Vehicle {

    private int numOfDoors;

    // Parent fields are private, so they are passed to the parent
    // constructor with super(...). It must be the first line.
    public Car(String brand, int year, int numOfDoors) {
        super(brand, year);
        this.setNumOfDoors(numOfDoors);
    }

    // Behavior that belongs only to cars
    public void startEngine() {
        System.out.println("Engine started.");
    }

    // Parent details first, then the number of doors
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + this.numOfDoors);
    }

    // A car must have between 2 and 5 doors, otherwise 4 is used
    public void setNumOfDoors(int numOfDoors) {
        if (numOfDoors >= 2 && numOfDoors <= 5) {
            this.numOfDoors = numOfDoors;
        } else {
            System.out.println("Invalid number of doors.");
            this.numOfDoors = 4;
        }
    }

    public int getNumOfDoors() {
        return this.numOfDoors;
    }
}