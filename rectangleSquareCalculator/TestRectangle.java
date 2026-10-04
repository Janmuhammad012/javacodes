package rectangleSquareCalculator;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // no argument
        Rectangle r1 = new Rectangle();
        r1.printInfo();

        // one argument (square)
        Rectangle square = new Rectangle(5.0);
        square.printInfo();

        // two arguments
        Rectangle rect = new Rectangle(6.0, 7.0);
        rect.printInfo();

        // using setters
        Rectangle r2 = new Rectangle();
        r2.setLength(20);
        r2.setBreadth(2);
        r2.printInfo();

        // invalid values
        Rectangle invalid = new Rectangle();
        invalid.setLength(-7);
        invalid.setBreadth(0);
        invalid.printInfo();

        // input from user
        Rectangle r3 = new Rectangle();
        r3.inputData(sc);
        r3.printInfo();

        sc.close();
    }
}