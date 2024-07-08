//Uppercase and Lowercase character using ASCII value.
import java.util.*;
public class Cp19 {
    public static void main(String[] args) {
        char Uppercase,lowercase;
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the uppercase :");
        Uppercase = input.next().charAt(0);
        System.out.print("enter the lowercase :");
        lowercase = input.next().charAt(0);
       
        System.out.println("uppercase =" + (int)Uppercase);
        System.out.println("lowercase =" + (int)lowercase);

    }

    
}
