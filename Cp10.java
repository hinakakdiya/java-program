//calculate simple interest (si=p*r*n/100).
import java.util.*;
public class Cp10 {
    public static void main(String[] args) {
        float si,p,r,n;
        Scanner input = new Scanner(System.in);
       
        System.out.print("enter the value of p :");
        p = input.nextFloat();
        System.out.print("enter the value of r :");
        r = input.nextFloat();
        System.out.print("enter the value of n :");
        n = input.nextFloat();
       
        si = p*r*n/100;
        System.out.println("si= " + si);
    }
}
