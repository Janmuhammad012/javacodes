package vehicleInheritance;

/**
 * A Tesla is an electric car with autopilot.
 * It is the last (bottom) class of the inheritance chain.
 */
public class Tesla extends ElectricCar {

    // Autopilot is off until the driver engages it
    private boolean autopilotEngaged = false;

    // Brand, doors and battery are fixed for this model, so only the year is needed
    public Tesla(int year) {
        super("Tesla", year, 4, 100);
    }

    public void engageAutopilot() {
        this.autopilotEngaged = true;
        System.out.println("Autopilot engaged.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Autopilot: " + (this.autopilotEngaged ? "ON" : "OFF"));
    }

    public boolean isAutopilotEngaged() {
        return this.autopilotEngaged;
    }
}