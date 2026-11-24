package constructorChain;


 // Middle (parent) class. It extends ClassA and is the parent of ClassC.

public class ClassB extends ClassA {

    // No explicit super(...) call, so Java adds super() automatically
    // and ClassA() runs first.
    public ClassB() {
        System.out.println("Class B: no-argument constructor");
    }

    // Explicit call: runs ClassA(int) before the rest of this constructor
    public ClassB(int a) {
        super(a);
        System.out.println("Class B: one-argument constructor");
    }

    // No explicit super(...) call, so Java adds super() automatically.
    // This means ClassA() runs here, NOT ClassA(int, int).
    public ClassB(int a, int b) {
        System.out.println("Class B: two-argument constructor");
    }
}