package payRollCalculationWithInheritance;


public class CommissionEmployee {

    // Private fields (encapsulation): changed only through validated setters
    private String empId;
    private String empName;
    private double commRate;
    private double grossSale;

    // No-argument constructor: sets safe default values
    public CommissionEmployee() {
        this("unknown", "unknown", 0.0, 0.0);
    }

    // Full constructor: uses setters so validation always runs
    public CommissionEmployee(String id, String name, double rate, double sale) {
        this.setEmpId(id);
        this.setEmpName(name);
        this.setCommRate(rate);
        this.setGrossSale(sale);
    }

    // Calculates the commission earning
    public double earning() {
        return this.commRate * this.grossSale;
    }

    // Returns the employee details as formatted text
    @Override
    public String toString() {
        return String.format(
                "Employee ID     : %s%n" +
                        "Employee Name   : %s%n" +
                        "Commission Rate : %.2f%n" +
                        "Gross Sale      : %.2f",
                this.empId, this.empName, this.commRate, this.grossSale);
    }

    // ---------- Setters with validation ----------

    // ID must not be null or empty
    public void setEmpId(String id) {
        if (id == null || id.trim().isEmpty()) {
            System.out.println("Invalid employee id.");
            this.empId = "unknown";
        } else {
            this.empId = id;
        }
    }

    // Name must not be null or empty
    public void setEmpName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid employee name.");
            this.empName = "unknown";
        } else {
            this.empName = name;
        }
    }

    // Rate must be greater than 0 and less than 1
    public void setCommRate(double rate) {
        if (rate > 0.0 && rate < 1.0) {
            this.commRate = rate;
        } else {
            System.out.println("Invalid commission rate (must be between 0 and 1).");
            this.commRate = 0.0;
        }
    }

    // Gross sale cannot be negative
    public void setGrossSale(double sale) {
        if (sale >= 0.0) {
            this.grossSale = sale;
        } else {
            System.out.println("Invalid gross sale (cannot be negative).");
            this.grossSale = 0.0;
        }
    }

    // ---------- Getters ----------

    public String getEmpId() {
        return this.empId;
    }

    public String getEmpName() {
        return this.empName;
    }

    public double getCommRate() {
        return this.commRate;
    }

    public double getGrossSale() {
        return this.grossSale;
    }
}