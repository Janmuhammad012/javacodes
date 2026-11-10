package shoppingCartStudy;

/**
 * Represents a single product in the shopping cart.
 */
public class Item {

    // Private fields (encapsulation): can only be accessed through getters
    private int itemId;
    private String description;
    private double price;

    // Constructor: runs when a new Item object is created
    public Item(int id, String description, double price) {
        this.itemId = id;
        this.description = description;
        this.price = price;
    }

    // Returns the item as a formatted row (used when printing the cart)
    @Override
    public String toString() {
        return String.format("%-15d %-15s %-15.2f", itemId, description, price);
    }

    // Getters
    public int getItemId() {
        return this.itemId;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }
}