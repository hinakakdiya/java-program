import java.util.*;

class outer {
   int a = 10;

    class Inner {
        int b = 20;
    }

}

class outerinner{
    public static void main(String[] args) {
       
        outer obj = new outer();
        outer.Inner inner = obj.new Inner();
        System.out.println(obj.a+inner.b);
    }
}
