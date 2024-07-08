//method overriding.
//A ni property overrid thashe.
import java.util.*;

class A {
    void moye() {
        System.out.println("In class A)");
    }

}

class B extends A {
    void moye() {
        System.out.println("In class B");
    }
}

public class polymorphism {
    public static void main(String[] args) {
    
        B bb = new B();
        bb.moye();
        bb.moye();
    }
}
