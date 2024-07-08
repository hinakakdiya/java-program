class A {
    A() {
        //super();
        System.out.println("Hello I am In A class");
    }
}

class B extends A {
    B() {
        //super();
        System.out.println("Hello I am In B class");
    }
}

class superkey{
    public static void main(String[] args) {
        // A aa = new A();
        B bb = new B();
    }
}