//abstract keyword
import java.util.*;
abstract class A {
    abstract void get();
    public void set()
    {
        System.out.println("Hasta la Vista, baby");
    }
}
class B extends A{
    public void get()
    {
        System.out.println("Hello Nyuti, How Are You");
    }

}
class abstractclass {
     public static void main(String[] args)
    {
        A bb = new B();
        bb.set();
        bb.get();
    }
}


