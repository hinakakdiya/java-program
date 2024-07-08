import java.util.*;

class chattingwithGF implements Runnable {

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Chatting with GF :" + i);
        }
    }
}

class Makingmaggie implements Runnable {

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Making maggie :" + i);
        }
    }
}

class implement {
    public static void main(String[] args) {

        chattingwithGF gf = new chattingwithGF();
        Makingmaggie mg = new Makingmaggie();

        Thread T1 = new Thread(gf);
        Thread T2 = new Thread(mg);

        T1.start();
        T2.start();
        // gf.start();
        // mg.start();
    }
}
