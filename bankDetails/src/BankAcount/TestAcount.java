package BankAcount;
import java.util.Scanner;
public class TestAcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account obj = new Account();       // starts with default values
        int choice;

        do {
            System.out.println("\n====== ACCOUNT MENU ======");
            System.out.println("1. Enter account details");
            System.out.println("2. Display account details");
            System.out.println("3. Deposit amount");
            System.out.println("4. Withdraw amount");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.inputDetails(sc);
                    break;
                case 2:
                    obj.displayDetails();
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    obj.depositAmount(sc.nextDouble());
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    obj.withdrawAmount(sc.nextDouble());
                    break;
                case 5:
                    System.out.println("Thank you. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again");
            }
        } while (choice != 5);

        sc.close();
    }
}
