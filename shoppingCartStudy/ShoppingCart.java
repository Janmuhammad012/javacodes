package shoppingCartStudy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Manages a collection of Items: add, print, remove, clear and total price.
 */
public class ShoppingCart {

    // List that stores all items in the cart
    private ArrayList<Item> cart = new ArrayList<>();

    // Adds an item to the cart
    public void addItem(Item item) {
        this.cart.add(item);
        System.out.println("Item added.");
    }

    // Prints all items in a table format
    public void printCart() {
        System.out.printf("%-15s %-15s %-15s\n", "Id", "Description", "Price");

        for (int i = 0; i < cart.size(); i++) {
            System.out.printf("%s\n", this.cart.get(i));
        }
    }

    // Removes an item by its id (the id is read from the user)
    public void deleteItem(Scanner sc) {
        System.out.println("Enter id:");
        int id = sc.nextInt();

        int index = -1; // -1 means "not found"

        // Search for the item with the given id
        for (int i = 0; i < cart.size(); i++) {
            if (this.cart.get(i).getItemId() == id) {
                index = i;
                break; // stop searching once found
            }
        }

        if (index == -1) {
            System.out.println("No record found.");
        } else {
            this.cart.remove(index);
            System.out.println("Record removed.");
        }
    }

    // Removes all items from the cart
    public void clearCart() {
        this.cart.clear();
        System.out.println("Cart cleared.");
    }

    // Prints the cart and then the sum of all item prices
    public void totalPrice() {
        this.printCart();

        double total = 0;
        for (int i = 0; i < cart.size(); i++) {
            total = total + this.cart.get(i).getPrice();
        }
        System.out.println("Total price: " + total);
    }
}