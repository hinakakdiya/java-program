//given temperature in fahrenheit to celsius(c=(5/9)(f-32).
import java.util.*;
public class Cp12 {
    public static void main(String[] args) {
        double c,f;
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the fahrenheit :");
        f = input.nextDouble();
       
        c = 0.55*(f-32);
        System.out.println("celsius =" + c); 
    }
}
