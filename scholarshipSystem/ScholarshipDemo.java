package scholarshipSystem;


public class ScholarshipDemo {

    public static void main(String[] args) {

        // Array of Student objects
        Student[] students = {
                new Student("ali", 50000),
                new Student("khan", 60000),
                new Student("bilal", 45000)
        };

        // Report with the default scholarship (20%)
        printReport(students);

        // Change the percentage ONCE: all students are affected
        Student.setScholarshipPercent(30);
        printReport(students);

        // Invalid percentage: rejected, the old value (30%) stays
        Student.setScholarshipPercent(150);
    }

    // Prints a table for all students, followed by a totals row
    private static void printReport(Student[] students) {
        System.out.printf("%nScholarship rate: %.1f%%%n", Student.getScholarshipPercent());
        Student.printHeader();

        double totalFee = 0;
        double totalScholarship = 0;
        double totalPayable = 0;

        for (Student s : students) {
            s.printRow();
            totalFee += s.getSemesterFee();
            totalScholarship += s.calculateScholarship();
            totalPayable += s.calculatePayableFee();
        }

        System.out.println(Student.SEPARATOR);
        System.out.printf("%-15s %,15.2f %,15.2f %,15.2f%n",
                "TOTAL", totalFee, totalScholarship, totalPayable);
        System.out.println(Student.SEPARATOR);
    }
}