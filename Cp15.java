//interchange the value of two variables. 
import java.util.*;
public class Cp15 {
    public static void main(String[] args) {
        int x,y,a;
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the value of x :");
        x = input.nextInt();
        System.out.print("enter the value of y :");
        y = input.nextInt();
       
        a = x;
        x = y;
        y = a;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
