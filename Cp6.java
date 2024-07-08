//Addition of three variable.
import java.util.*;
public class Cp6 {
    public static void main(String[] args) {
        int a,b,c,x;
         Scanner input = new Scanner (System.in);
       
        System.out.print("enter the value of a:");
        a = input.nextInt();
        System.out.print("enter the value of b:");
        b = input.nextInt();
        System.out.print("enter the value ov c:");
        c = input.nextInt();
       
        x = a+b+c;
        System.out.println("x =" + x);
    }
    
}
