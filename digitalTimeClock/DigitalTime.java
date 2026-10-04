package digitalTimeClock;

import java.util.Scanner;

public class DigitalTime {

    // ---------- (private = encapsulation) ----------
    private int hrs;
    private int mins;
    private int secs;

    // Constructors (constructor chaining with this)
    public DigitalTime() {
        this(0, 0, 0);
    }

    public DigitalTime(int h) {
        this(h, 0, 0);
    }

    public DigitalTime(int h, int m) {
        this(h, m, 0);
    }

    public DigitalTime(int h, int m, int s) {
        this.setHrs(h);
        this.setMins(m);
        this.setSecs(s);
    }

    // ---------- Methods ----------
    public void inputData(Scanner sc) {
        System.out.println("Enter hours");
        this.setHrs(sc.nextInt());
        System.out.println("Enter minutes");
        this.setMins(sc.nextInt());
        System.out.println("Enter seconds");
        this.setSecs(sc.nextInt());
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", this.hrs, this.mins, this.secs);  // FIX 4, 5
    }

    // Setters (validation)
    public void setHrs(int h) {
        if (h >= 0 && h < 24) {
            this.hrs = h;
        } else {
            System.out.println("Invalid hours");
            this.hrs = 0;
        }
    }

    public void setMins(int m) {
        if (m >= 0 && m < 60) {
            this.mins = m;
        } else {
            System.out.println("Invalid minutes");
            this.mins = 0;
        }
    }

    public void setSecs(int s) {
        if (s >= 0 && s < 60) {
            this.secs = s;
        } else {
            System.out.println("Invalid seconds");
            this.secs = 0;
        }
    }

    // ---------- Getters ----------
    public int getHrs() {
        return this.hrs;
    }

    public int getMins() {
        return this.mins;
    }

    public int getSecs() {
        return this.secs;
    }
}