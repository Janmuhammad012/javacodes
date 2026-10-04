package studentGradeManagementSystem;

import java.util.Scanner;

public class Student {

    private String name;
    private int rollNo;
    private double marks;

    // constructors
    public Student() {
        this("Unknown", 0, 0.0);
    }

    public Student(String name, int rollNo) {
        this(name, rollNo, 0.0);
    }

    public Student(String name, int rollNo, double marks) {
        this.setName(name);
        this.setRollNo(rollNo);
        this.setMarks(marks);
    }

    // methods
    public void inputData(Scanner sc) {
        System.out.println("Enter name");
        this.setName(sc.nextLine());
        System.out.println("Enter roll number");
        this.setRollNo(sc.nextInt());
        System.out.println("Enter marks");
        this.setMarks(sc.nextDouble());
    }

    public String calculateGrade() {
        if (this.marks >= 80) {
            return "A";
        } else if (this.marks >= 70) {
            return "B";
        } else if (this.marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public void displayDetails() {
        System.out.println("--------------------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Marks: " + this.marks);
        System.out.println("Grade: " + this.calculateGrade());
        System.out.println("--------------------------------------------");
    }

    // setters (validation)
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name");
            this.name = "Unknown";
        } else {
            this.name = name.trim();
        }
    }

    public void setRollNo(int rollNo) {
        if (rollNo >= 0) {
            this.rollNo = rollNo;
        } else {
            System.out.println("Invalid roll number");
            this.rollNo = 0;
        }
    }

    public void setMarks(double marks) {
        if (marks >= 0.0 && marks <= 100.0) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
            this.marks = 0.0;
        }
    }

    // getters
    public String getName() {
        return this.name;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public double getMarks() {
        return this.marks;
    }
}