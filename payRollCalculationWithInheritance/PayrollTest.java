package payRollCalculationWithInheritance;


public class PayrollTest {

    public static void main(String[] args) {

        // Test 1: commission employee
        CommissionEmployee emp = new CommissionEmployee("333(44)44", "ali", 0.05, 50000);
        System.out.println("---- Commission Employee ----");
        System.out.println(emp);
        System.out.printf("Earning         : %.2f%n%n", emp.earning());

        // Test 2: base plus commission employee
        BasePlusCommissionEmployee empPlus =
                new BasePlusCommissionEmployee("44(55)33", "jan", 0.4, 60000, 500000);
        System.out.println("---- Base Plus Commission Employee ----");
        System.out.println(empPlus);
        System.out.printf("Earning         : %.2f%n%n", empPlus.earning());

        // Test 3: polymorphism - a parent reference holding a child object
        CommissionEmployee ref = empPlus;
        System.out.println("---- Polymorphism ----");
        System.out.printf("Earning through parent reference: %.2f%n%n", ref.earning());

        // Test 4: invalid data shows the validation messages
        System.out.println("---- Invalid Data Test ----");
        CommissionEmployee bad = new CommissionEmployee("", "bob", 1.5, -100);
        System.out.println(bad);
    }
}