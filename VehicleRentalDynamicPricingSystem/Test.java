package VehicleRentalDynamicPricingSystem;

import java.util.ArrayList;   // imports go at the TOP, outside the class
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        // ---- paste only the body here ----
        Scanner input = new Scanner(System.in);

        ArrayList<Vehicle> fleet = new ArrayList<>();

        fleet.add(new Car("C101", "Corolla", 5000, 4, 500));
        fleet.add(new Car("C102", "Civic", 5500, 5, 700));
        fleet.add(new Truck("T201", "Hino500", 7000, 6.5, 2000));
        fleet.add(new Truck("T202", "IsuzuNPR", 6000, 5.0, 1500));

        System.out.println("====== Available Vehicles ======");
        for (Vehicle v : fleet) {
            v.displayDetails();
        }

        System.out.println("Add your own vehicle:");
        System.out.println("1. Car");
        System.out.println("2. Truck");

        System.out.print("Select vehicle type: ");
        int choice = input.nextInt();

        Vehicle vehicle = null;

        if (choice == 1) {
            System.out.print("Enter ID: ");
            String id = input.next();
            System.out.print("Enter Model: ");
            String model = input.next();
            System.out.print("Enter Daily Rate: ");
            double rate = input.nextDouble();
            System.out.print("Enter Seating Capacity: ");
            int seats = input.nextInt();
            System.out.print("Enter Insurance Fee: ");
            double insurance = input.nextDouble();

            vehicle = new Car(id, model, rate, seats, insurance);

        } else if (choice == 2) {
            System.out.print("Enter ID: ");
            String id = input.next();
            System.out.print("Enter Model: ");
            String model = input.next();
            System.out.print("Enter Daily Rate: ");
            double rate = input.nextDouble();
            System.out.print("Enter Cargo Weight (tons): ");
            double weight = input.nextDouble();
            System.out.print("Enter Heavy Duty Rate: ");
            double heavyRate = input.nextDouble();

            vehicle = new Truck(id, model, rate, weight, heavyRate);

        } else {
            System.out.println("Invalid choice!");
            return;
        }

        fleet.add(vehicle);

        System.out.print("Enter rental days: ");
        int days = input.nextInt();
        vehicle.bookVehicle(days);

        System.out.println("====== Updated Fleet ======");
        for (Vehicle v : fleet) {
            v.displayDetails();
        }

        System.out.println("Total vehicles: " + Vehicle.getTotalVehicles());
        System.out.printf("Total revenue : %,.2f%n", Vehicle.getTotalRentalRevenue());

        input.close();
    }
}