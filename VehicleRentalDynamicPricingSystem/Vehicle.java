package VehicleRentalDynamicPricingSystem;

/**
 * Parent class for all rental vehicles.
 * Static variables are shared by ALL vehicles in the fleet.
 */
public class Vehicle {

    // protected: visible to child classes (Car, Truck) and the same package
    protected String vehicleId;
    protected String model;
    protected double dailyRate;

    // Static: one copy for the whole fleet
    protected static int totalVehicles = 0;
    protected static double totalRentalRevenue = 0.0;

    public Vehicle(String vehicleId, String model, double dailyRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.dailyRate = dailyRate;
        totalVehicles++; // count every vehicle created (the missing line)
    }

    // Base cost; child classes override this with their own pricing rules
    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }

    // Validates days, adds the cost to total revenue and prints a receipt
    public void bookVehicle(int days) {
        if (days <= 0) {
            System.out.println("Invalid days for " + vehicleId + ". Booking rejected.\n");
            return;
        }

        // Calls the child's version of calculateRentalCost (polymorphism)
        double cost = calculateRentalCost(days);
        totalRentalRevenue += cost;

        System.out.println("------ Booking Receipt ------");
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Model      : " + model);
        System.out.printf("Daily rate : %,.2f%n", dailyRate);
        System.out.println("Days       : " + days);
        System.out.printf("Total cost : %,.2f%n", cost);
        System.out.println("-----------------------------\n");
    }

    public void displayDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Model      : " + model);
        System.out.printf("Daily rate : %,.2f%n", dailyRate);
    }

    // Static getters: called as Vehicle.getTotalVehicles()
    public static int getTotalVehicles() {
        return totalVehicles;
    }

    public static double getTotalRentalRevenue() {
        return totalRentalRevenue;
    }
}