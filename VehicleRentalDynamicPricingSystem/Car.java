package VehicleRentalDynamicPricingSystem;

public class Car extends Vehicle {

    private int seatingCapacity;
    private double insuranceFee;

    public Car(String vehicleId, String model, double dailyRate,
               int seatingCapacity, double insuranceFee) {
        super(vehicleId, model, dailyRate); // must be the first line
        this.seatingCapacity = seatingCapacity;
        this.insuranceFee = insuranceFee;
    }

    // 5 or more days: 10% discount on the base rental, insurance is added after
    @Override
    public double calculateRentalCost(int days) {
        if (days >= 5) {
            return (dailyRate * days * 0.90) + insuranceFee;
        }
        return (dailyRate * days) + insuranceFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seats      : " + seatingCapacity);
        System.out.printf("Insurance  : %,.2f%n%n", insuranceFee);
    }


}