package constructorChain;


 //Top-level (grandparent) class.
 //Its constructors only print a message so we can see the order of calls.

public class ClassA {

    public ClassA() {
        System.out.println("Class A: no-argument constructor");
    }

    public ClassA(int a) {
        System.out.println("Class A: one-argument constructor");
    }

    public ClassA(int a, int b) {
        System.out.println("Class A: two-argument constructor");
    }
}
