//single level inharitance.
import java.util.*;

class A {
    int a, b;

}

class B extends A {
    Scanner sc = new Scanner(System.in);

    public void setter() {
        System.out.print("enter a value :");
        a = sc.nextInt();
        System.out.print("enter b value :");
        b = sc.nextInt();
    }

    public void sum() {
        System.out.println("a = " + a + "  " +"b = " + b);
        System.out.println("a+b = " + (a + b));
    }
}

    class singleinhari {
        public static void main(String[] args) {
            B bb = new B();
            bb.setter();
            bb.sum();
        }
    }


