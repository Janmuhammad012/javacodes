package rectangleSquareCalculator;

import java.util.Scanner;

public class Rectangle {

    private double length;
    private double breadth;

    // constructors
    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double side) {
        this(side, side);          // one value gives a square
    }

    public Rectangle(double length, double breadth) {
        this.setLength(length);
        this.setBreadth(breadth);
    }

    // methods
    public void inputData(Scanner sc) {
        System.out.println("Enter length");
        this.setLength(sc.nextDouble());
        System.out.println("Enter breadth");
        this.setBreadth(sc.nextDouble());
    }

    public double calculateArea() {
        return this.length * this.breadth;
    }

    public double calculatePerimeter() {
        return 2 * (this.length + this.breadth);
    }

    public boolean isSquare() {
        return this.length == this.breadth;
    }

    public void printInfo() {
        System.out.println("--------------------------------------------");
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
        System.out.println("Area: " + this.calculateArea());
        System.out.println("Perimeter: " + this.calculatePerimeter());
        System.out.println("Is square: " + this.isSquare());
        System.out.println("--------------------------------------------");
    }

    // setters (only positive values are accepted)
    public void setLength(double length) {
        if (length > 0.0) {
            this.length = length;
        } else {
            System.out.println("Invalid length, set to 1.0");
            this.length = 1.0;
        }
    }

    public void setBreadth(double breadth) {
        if (breadth > 0.0) {
            this.breadth = breadth;
        } else {
            System.out.println("Invalid breadth, set to 1.0");
            this.breadth = 1.0;
        }
    }

    // getters
    public double getLength() {
        return this.length;
    }

    public double getBreadth() {
        return this.breadth;
    }
}