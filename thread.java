import java.util.*;

class chattingwithGF extends Thread {
    
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            System.out.println("Chatting with GF :" + i);
        }
    }
}

class Makingmaggie extends Thread {
    public void run() {
        for(int i=1;i<=100;i++){
        System.out.println("Making maggie :" + i);
        }
    }
} 

public class thread {
    public static void main(String[] args) {
        chattingwithGF gf = new chattingwithGF();
        Makingmaggie mg = new Makingmaggie();

        gf.start();
        mg.start();
    }
}
