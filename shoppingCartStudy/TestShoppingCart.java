package shoppingCartStudy;

import java.util.Scanner;

/**
 * Menu-driven program to test the ShoppingCart class.
 */
public class TestShoppingCart {

    public static void main(String[] args) {

        ShoppingCart obj = new ShoppingCart();

        // One Scanner for the whole program (created once, outside the loop)
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("\n1) Add Item\n2) Print Cart\n3) Remove Item\n4) Clear Cart\n5) Total Price\n6) Exit");
            System.out.println("Enter option:");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.println("Enter item id:");
                int id = sc.nextInt();

                sc.nextLine(); // consumes the leftover newline after nextInt()

                System.out.println("Enter description:");
                String des = sc.nextLine();

                System.out.println("Enter price:");
                double price = sc.nextDouble();

                Item temp = new Item(id, des, price);
                obj.addItem(temp);

            } else if (op == 2) {
                obj.printCart();
            } else if (op == 3) {
                obj.deleteItem(sc);
            } else if (op == 4) {
                obj.clearCart();
            } else if (op == 5) {
                obj.totalPrice();
            } else if (op == 6) {
                System.out.println("Thanks!");
                running = false; // ends the loop
            } else {
                System.out.println("Invalid option.");
            }
        }

        sc.close(); // release the Scanner resource
    }
}