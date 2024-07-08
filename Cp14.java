//calculate the sum of 5 digits using modulo operator.
import java.util.*;
public class Cp14 {
    public static void main(String[] args) {
        int a,b,c,d,e,x,n;
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the n number :");
        n = input.nextInt();

        a = n % 10;
        n = n / 10;
        b = n % 10;
        n = n / 10;
        c = n % 10;
        n = n / 10;
        d = n % 10;
        e = n / 10;

        x = a+b+c+d+e;
        System.out.println("x =" + x);
    }
    
}
