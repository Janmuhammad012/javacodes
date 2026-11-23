package payRollCalculationWithInheritance;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    // Extra field that the parent class does not have
    private double baseSalary;

    // Constructor: parent fields are private, so we pass them to the
    // parent constructor with super(...)
    public BasePlusCommissionEmployee(String id, String name, double commRate,
                                      double baseSalary, double grossSale) {
        super(id, name, commRate, grossSale); // must be the first line
        this.setBaseSalary(baseSalary);
    }

    // Base salary cannot be negative
    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0.0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Invalid base salary (cannot be negative).");
            this.baseSalary = 0.0;
        }
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    // Earning = base salary + commission (commission comes from the parent)
    @Override
    public double earning() {
        return this.baseSalary + super.earning();
    }

    // Parent details + base salary line
    @Override
    public String toString() {
        return super.toString() +
                String.format("%nBase Salary     : %.2f", this.baseSalary);
    }
}