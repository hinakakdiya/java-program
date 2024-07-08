//calculate perimeter fo rectangle(2l+2b).
import java.util.*;
public class Cp16 {
    public static void main(String[] args) {
        float l,b,x;
        Scanner input = new Scanner(System.in);
       
        System.out.print("enter the value of l :");
        l = input.nextFloat();
        System.out.print("enter the value of b :");
        b = input.nextFloat();
       
        x = 2*(l+b);
        System.out.println("perimeter of rectangle = " + x);
    }
}
