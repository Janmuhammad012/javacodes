package constructorChain;

/**
 * Bottom (child) class. It extends ClassB, which extends ClassA.
 */
public class ClassC extends ClassB {

    // Implicit super() runs ClassB(), which then runs ClassA()
    public ClassC() {
        System.out.println("Class C: no-argument constructor");
    }

    // Explicit call to ClassB(int, int), chosen on purpose.
    // The commented line below would call ClassB(int) instead.
    public ClassC(int a) {
        // super(a);
        super(a, 4);
        System.out.println("Class C: one-argument constructor");
    }

    // Implicit super() runs ClassB(), which then runs ClassA()
    public ClassC(int a, int b) {
        System.out.println("Class C: two-argument constructor");
    }
}