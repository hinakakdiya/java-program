package mypackage;
import java.util.*;

public class mysecond {
    public int a, b;
    Scanner sc = new Scanner(System.in);

    public void set() {
        System.out.println("a&b=");
        a = sc.nextInt();
        b = sc.nextInt();

    }

    public void sum() {
        System.out.println("a+b=" + (a + b));
    }

    public void sub() {
        System.out.println("a-b=" + (a - b));
    }

    public void mul() {
        System.out.println("a*b=" + (a * b));
    }

    public void div() {
        System.out.println("a/b=" + (a / b));
    }

    public void modul() {
        System.out.println("a%b=" + (a % b));
    }
}
