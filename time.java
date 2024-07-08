//passing object as argument & Returning object.
//do enter second 7200 & 3600 and answer is 3 hour,180 minutes,10800 second. 

import java.util.*;

class A {

    int h, m, s;
    Scanner sc = new Scanner(System.in);

    public void setter() {
        System.out.print("enter the second=");
        s = sc.nextInt();
    }

    public void getter() {
        System.out.println("hour" + h + "   " + "minutes" + m + "   " + "second" + s);
    }

    public A calculate(A obj) {
        A aa = new A();

        aa.h = s / 3600 + obj.s / 3600;
        aa.m = s / 60 + obj.s / 60;
        aa.s = s + obj.s;

        return aa;
    }
}

public class time {
    public static void main(String[] args) {

        A aaa = new A();
        A bb = new A();

        aaa.setter();
        bb.setter();

        A a1 = aaa.calculate(bb);
        a1.getter();

    }
}
