//evaluates following algebraic equation: Y=6X*X+3x+8 , X is an input value.
import java.util.*;
public class Cp20 {
    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);
       
        System.out.print("enter the value of x :");
        x = input.nextInt();
        
        y = 6*x*x+3*x+8;
        System.out.println("y = " + y);
    }
    
}
