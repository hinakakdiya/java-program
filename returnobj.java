//passing object as argument & Returning object.

import java.util.*;

class A {
    int a, b;
    Scanner sc = new Scanner(System.in);

    public void set() {

        System.out.println("a+b=");
        System.out.print("a=");
        a = sc.nextInt();
        System.out.print("b=");
        b = sc.nextInt();
    }

    public void get() {
        System.out.println("a=" + a + "  " + "b=" + b);
    }

    public A add(A obj) {
        A objoutput = new A();

        objoutput.a = a + obj.a;
        objoutput.b = b + obj.b;
        return objoutput;

    }

}

public class returnobj {
    public static void main(String[] args) {

        A aa1 = new A();
        A aa2 = new B();

        aa1.set();
        aa2.set();

        A output = aa1.add(aa2);
        output.get();
    }
}
