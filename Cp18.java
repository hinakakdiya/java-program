//diameter of circle(d=2*r) & calculate area(a=pi*r*r) & perimeter of the circle(p=2*pi*r).
import java.util.*;
public class Cp18 {
    public static void main(String[] args) {
        float d,r,pi=3.14F,a,p;
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the value of r :");
        r = input.nextFloat();

        d = 2*r;
        a = pi*r*r;
        p = 2*pi*r;
         
        System.out.println("diameter = " + d);
        System.out.println("area = " + a);
        System.out.println("perimeter = "+ p);
    }

    
}
