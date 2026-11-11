package bookInventory;

/**
 * Tests the Book class with different constructors.
 */
public class TestBook {

    public static void main(String[] args) {

        // Four-parameter constructor: all values given
        Book book1 = new Book("oop", "jan", 300.0, 5);
        book1.printDetails();

        // Three-parameter constructor: stock defaults to 0
        Book book2 = new Book("c++", "khan", 50000.0);
        book2.printDetails();

        // Two-parameter constructor: price defaults to 100.0, stock to 0
        Book book3 = new Book("oop", "jan");
        book3.printDetails();

        // Invalid data test: shows the validation messages and default values
        Book book4 = new Book("", null, -50.0, -3);
        book4.printDetails();
    }
}