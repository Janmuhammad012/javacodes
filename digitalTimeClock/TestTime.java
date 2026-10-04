package digitalTimeClock;

import java.util.Scanner;

public class TestTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // no-argument constructor
        DigitalTime t1 = new DigitalTime();
        t1.displayTime();

        // one parameter
        DigitalTime t2 = new DigitalTime(3);
        t2.displayTime();

        // two parameters
        DigitalTime t3 = new DigitalTime(4, 4);
        t3.displayTime();

        // three parameters
        DigitalTime t4 = new DigitalTime(5, 5, 5);
        t4.displayTime();

        // invalid values through setters
        DigitalTime t5 = new DigitalTime();
        t5.setHrs(90);
        t5.setMins(90);
        t5.setSecs(90);
        t5.displayTime();

        // input from user
        DigitalTime t6 = new DigitalTime();
        t6.inputData(sc);
        t6.displayTime();

        sc.close();
    }
}