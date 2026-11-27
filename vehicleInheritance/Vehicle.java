package vehicleInheritance;

/**
 * Top-level (parent) class for all vehicles.
 * It stores the data that every vehicle has: brand and year.
 */
public class Vehicle {

    // Used when an invalid year is given
    private static final int DEFAULT_YEAR = 2026;

    // Private fields (encapsulation): child classes use getters and setters
    private String brand;
    private int year;

    // Constructor: uses setters so validation always runs
    public Vehicle(String brand, int year) {
        this.setBrand(brand);
        this.setYear(year);
    }

    // Prints the vehicle details. Child classes override this method.
    public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Year : " + this.year);
    }

    // Brand must not be null or empty
    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            System.out.println("Invalid brand.");
            this.brand = "unknown";
        } else {
            this.brand = brand;
        }
    }

    // Year must be between 1886 (first car) and 2100
    public void setYear(int year) {
        if (year >= 1886 && year <= 2100) {
            this.year = year;
        } else {
            System.out.println("Invalid year.");
            this.year = DEFAULT_YEAR;
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public int getYear() {
        return this.year;
    }
}