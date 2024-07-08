//multi level inharitance.
import java.util.*;

class A {
    int a, b;
    Scanner sc = new Scanner(System.in);

    public void setter() {
        System.out.print("enter the a value : ");
        a = sc.nextInt();
        System.out.print("enter the b value : ");
        b = sc.nextInt();

    }
}

class B extends A
{

    public void getter() {
        System.out.println("a =" + a + "  " + "b=" + b);
    }
}

class C extends B
{

    public void sum() {
        System.out.println("a + b =" + (a + b));
    }
}

class multiinhari {
    public static void main(String[] args) {
        C cc = new C();
        cc.setter();
        cc.getter();
        cc.sum();
    }
}
