//character to integer.
//integer to character.
import java.util.*;
public class CtoI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("enter any char =");
        char c = input.next().charAt(0);
        System.out.println("c =  "+(int)c);

        System.out.print("enter any number =");
        int a = input.nextInt();
        System.out.println("a = "+ (char)a);

        
    }
   
    
}
