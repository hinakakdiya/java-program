//multipal class mathod.
import java.util.*;

class arm {

    int n, i, a, sum = 0, temp;
    Scanner sc = new Scanner(System.in);

    public void setter() {
        System.out.print("enter the n number : ");
        n = sc.nextInt();
    }

    public void getter() {
        temp = n;
        for (int i = 0; n > 0; i++) {
            a = n % 10;
            sum += a * a * a;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("this is armstrong number");
        } else {
            System.out.println("this is not armstrong number");
        }
    }
}

class fact {
    int n, fact = 1;
    Scanner sc = new Scanner(System.in);

    public void setter() {
        System.out.print("enter the n number : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
class fibonaci {
    int n,a = 0,b = 1,c;
    Scanner sc = new Scanner(System.in);

    public void getter() {
        System.out.print("enter the n number : ");
        n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
         }

    }
}

public class classobj {
    public static void main(String[] args) {
        arm a = new arm();
        a.setter();
        a.getter();
        fact f = new fact();
        f.setter();
        fibonaci fb = new fibonaci();
        fb.getter();
    }
}
