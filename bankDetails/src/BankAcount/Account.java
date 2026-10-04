package BankAcount;

import java.util.Scanner;

public class Account {
    private long accNo;
    private double accBal;
    private boolean accStatus;

    // ---------- Constructors (constructor chaining with this) ----------
    public Account() {
        this(222222L, 0.0, false);
    }

    public Account(long accNo) {
        this(accNo, 0.0, false);
    }

    public Account(long accNo, double accBal) {
        this(accNo, accBal, false);
    }

    public Account(long accNo, double accBal, boolean accStatus) {
        this.setAccNo(accNo);
        this.setAccBal(accBal);
        this.setAccStatus(accStatus);
    }

    // ---------- Methods ----------
    public void inputDetails(Scanner sc) {

        System.out.println("Enter account number");
        this.setAccNo(sc.nextLong());
        System.out.println("Enter balance");
        this.setAccBal(sc.nextDouble());
        System.out.println("Enter status (true/false)");
        this.setAccStatus(sc.nextBoolean());
    }

    public void displayDetails() {
        System.out.println("------------------------------");
        System.out.println("Account Number: " + this.getAccNo());
        System.out.println("Account Balance: " + this.getAccBal());
        System.out.println("Account Status: " + this.getAccStatus());
        System.out.println("------------------------------");
    }

    public void depositAmount(double amount) {
        if (amount > 0 && this.accStatus) {          // FIX 8
            this.accBal = this.accBal + amount;
            System.out.println("Your new balance: " + this.accBal);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdrawAmount(double amount) {      // FIX 6
        if (amount > 0 && amount <= this.accBal && this.accStatus) {   // FIX 3, 4
            this.accBal = this.accBal - amount;
            System.out.println("Withdraw success, current balance: " + this.accBal);
        } else {
            System.out.println("Invalid amount");   // FIX 4
        }
    }

    // ---------- Setters (validation) ----------
    public void setAccNo(long accNo) {
        if (accNo > 10000L && accNo <= 9999999999L) {
            this.accNo = accNo;
        } else {
            System.out.println("Invalid number");
            this.accNo = 11111L;
        }
    }

    public void setAccBal(double accBal) {
        if (accBal >= 0.0) {                         // FIX 2
            this.accBal = accBal;
        } else {
            System.out.println("Invalid balance");
            this.accBal = 0.0;                       // FIX 1
        }
    }

    public void setAccStatus(boolean accStatus) {
        this.accStatus = accStatus;
    }

    // ---------- Getters ----------
    public long getAccNo() {
        return this.accNo;
    }

    public double getAccBal() {
        return this.accBal;
    }

    public boolean getAccStatus() {
        return this.accStatus;
    }
}
