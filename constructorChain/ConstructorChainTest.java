package constructorChain;


 //Creates objects of ClassC (and ClassB) to show the order in which
 //constructors run: always parent first, then child.

public class ConstructorChainTest {

    public static void main(String[] args) {

        System.out.println("--- new ClassC(3) ---");
         new ClassC(3);

        System.out.println("\n--- new ClassC() ---");
        new ClassC();

        System.out.println("\n--- new ClassC(1, 2) ---");
        new ClassC(1, 2);

        System.out.println("\n--- new ClassB(5) ---");
        new ClassB(5);
    }
}