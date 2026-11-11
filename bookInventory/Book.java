package bookInventory;

/**
 * Represents a book in the inventory with title, author, price and stock.
 * All fields are private and validated through setters (encapsulation).
 */
public class Book {

    // Private fields: can only be changed through the setter methods
    private String title;
    private String authorName;
    private double price;
    private int stockQuantity;

    // Two-parameter constructor: default price is 100.0 and stock is 0
    public Book(String title, String authorName) {
        this(title, authorName, 100.0, 0);
    }

    // Three-parameter constructor: stock starts at 0
    public Book(String title, String authorName, double price) {
        this(title, authorName, price, 0);
    }

    // Four-parameter constructor: all other constructors call this one
    public Book(String title, String authorName, double price, int stockQuantity) {
        this.setTitle(title);
        this.setAuthorName(authorName);
        this.setPrice(price);
        this.setStockQuantity(stockQuantity);
    }

    // Prints all book details
    public void printDetails() {
        System.out.println("----------------------------");
        System.out.println("Book title  : " + this.title);
        System.out.println("Author name : " + this.authorName);
        System.out.println("Book price  : " + this.price);
        System.out.println("Quantity    : " + this.stockQuantity);
        System.out.println("----------------------------");
    }

    // Title must not be null or empty, otherwise it is set to "unknown"
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("Invalid title.");
            this.title = "unknown";
        } else {
            this.title = title;
        }
    }

    // Author name must not be null or empty, otherwise it is set to "unknown"
    public void setAuthorName(String authorName) {
        if (authorName == null || authorName.isEmpty()) {
            System.out.println("Invalid author name.");
            this.authorName = "unknown";
        } else {
            this.authorName = authorName;
        }
    }

    // Price must be greater than 0, otherwise the default price 100.0 is used
    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        } else {
            System.out.println("Invalid price.");
            this.price = 100.0;
        }
    }

    // Stock cannot be negative, otherwise it is set to 0
    public void setStockQuantity(int quantity) {
        if (quantity >= 0) {
            this.stockQuantity = quantity;
        } else {
            System.out.println("Invalid quantity.");
            this.stockQuantity = 0;
        }
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStockQuantity() {
        return this.stockQuantity;
    }
}