package VehicleRentalDynamicPricingSystem;

public class Truck extends Vehicle {

    private static final double OVERWEIGHT_LIMIT = 5.0;  // tons
    private static final double OVERWEIGHT_FEE = 3000.0; // Rs.

    private double cargoWeightTons;
    private double heavyDutyRatePerDay;

    public Truck(String vehicleId, String model, double dailyRate,
                 double cargoWeightTons, double heavyDutyRatePerDay) {
        super(vehicleId, model, dailyRate);
        this.cargoWeightTons = cargoWeightTons;
        this.heavyDutyRatePerDay = heavyDutyRatePerDay;
    }

    // Weight must be MORE than 5.0 tons for the extra fee
    @Override
    public double calculateRentalCost(int days) {
        double cost = (dailyRate + heavyDutyRatePerDay) * days;
        if (cargoWeightTons > OVERWEIGHT_LIMIT) {
            cost += OVERWEIGHT_FEE;
        }
        return cost;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Cargo      : " + cargoWeightTons + " tons");
        System.out.printf("Heavy duty : %,.2f per day%n%n", heavyDutyRatePerDay);
    }
}