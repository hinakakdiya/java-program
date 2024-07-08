import java.util.*;
class A {
    int a, b;
    
    A(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class B extends A {

    B(int x, int y) {
        super(x,y);
        
        System.out.println("a + b =" + (a + b));
    }
}

class superkey1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the A value:");
         int x = sc.nextInt();
        System.out.println("enter the B value:");
        int y = sc.nextInt();
        B bb = new B(x,y);
    }

}
