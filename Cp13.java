//Three digit number to obtain the sum of first and last digit of the number.
import java.util.*;
public class Cp13 {
    public static void main(String[] args) {
        int a,b,c,n,x;
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the n number :");
        n = input.nextInt();
        
        a = n % 10;
        n = n / 10;
        b = n % 10;
        c = n / 10;
        x = a + c;
        System.out.println("x = first digit and third digit sum : " + x);



    }  
}
