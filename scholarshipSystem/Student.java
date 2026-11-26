package scholarshipSystem;


public class Student {


    private static double scholarshipPercent = 20.0;

    // Line used to separate table rows (63 = total width of the table)
    public static final String SEPARATOR = "-".repeat(63);

    // Instance fields: every student has their own copy
    private String name;
    private double semesterFee;

    // Constructor: uses setters so validation always runs
    public Student(String name, double semesterFee) {
        this.setName(name);
        this.setSemesterFee(semesterFee);
    }

    // ---------- Static methods (belong to the class, not to an object) ----------

    // Changes the scholarship percentage for ALL students (must be 0 to 100)
    public static void setScholarshipPercent(double percent) {
        if (percent >= 0.0 && percent <= 100.0) {
            scholarshipPercent = percent;
        } else {
            System.out.println("Invalid percentage. It must be between 0 and 100.");
        }
    }

    public static double getScholarshipPercent() {
        return scholarshipPercent;
    }

    // Prints the table header once, before printing the rows
    public static void printHeader() {
        System.out.println(SEPARATOR);
        System.out.printf("%-15s %15s %15s %15s%n",
                "Name", "Semester Fee", "Scholarship", "Payable Fee");
        System.out.println(SEPARATOR);
    }

    // ---------- Calculations (they return values and do not print) ----------

    // Scholarship amount = fee * percentage / 100
    public double calculateScholarship() {
        return (this.semesterFee * scholarshipPercent) / 100;
    }

    // Fee the student actually pays after the scholarship
    public double calculatePayableFee() {
        return this.semesterFee - this.calculateScholarship();
    }

    // ---------- Display ----------

    // Prints one table row: text is left-aligned, numbers are right-aligned
    public void printRow() {
        System.out.printf("%-15s %,15.2f %,15.2f %,15.2f%n",
                this.name,
                this.semesterFee,
                this.calculateScholarship(),
                this.calculatePayableFee());
    }

    // ---------- Setters with validation ----------

    // Name must not be null or empty
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name.");
            this.name = "unknown";
        } else {
            this.name = name;
        }
    }

    // Fee cannot be negative
    public void setSemesterFee(double semesterFee) {
        if (semesterFee >= 0.0) {
            this.semesterFee = semesterFee;
        } else {
            System.out.println("Invalid fee (cannot be negative).");
            this.semesterFee = 0.0;
        }
    }

    // ---------- Getters ----------

    public String getName() {
        return this.name;
    }

    public double getSemesterFee() {
        return this.semesterFee;
    }
}