//area of circle(pi*r*r) and rectangle(l*b).
import java.util.*;
public class Cp9 {
    public static void main(String[] args) {
       
        float pi=3.14F,r,a,l,b,x;
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the value of r:");
        r = input.nextFloat();
        a = pi*r*r;
        System.out.println("area of circle= "+ a);
        
        System.out.print("enter the value of l:");
        l = input.nextFloat();
        System.out.print("enter the value of b:");
        b = input.nextFloat();
        x = l*b;
        System.out.println("area of rectangle= "+ x);
}
}

