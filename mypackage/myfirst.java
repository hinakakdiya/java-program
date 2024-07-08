package mypackage;

import java.util.*;

public class myfirst {
    public int a, b;
    Scanner sc = new Scanner(System.in);

    public void set() {
        System.out.println("HEllo I am In mypackage");
        System.out.println("a & b =");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    public void sum() {
        System.out.println("a+b=" + (a + b));
    }

}
