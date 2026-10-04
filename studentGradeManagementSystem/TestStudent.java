package studentGradeManagementSystem;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // no argument
        Student s1 = new Student();
        s1.displayDetails();

        // two arguments
        Student s2 = new Student("Ali", 3);
        s2.displayDetails();

        // three arguments
        Student s3 = new Student("Jan", 33, 100);
        s3.displayDetails();

        // invalid values
        Student invalid = new Student("  ", -5, 150);
        invalid.displayDetails();

        // input from user
        Student s4 = new Student();
        s4.inputData(sc);
        s4.displayDetails();

        sc.close();
    }
}