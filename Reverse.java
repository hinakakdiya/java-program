//reverse number.
import java.util.*;
public class Reverse {
    public static void main(String[] args){
    
       int a,b,c,n,rev;
       n = Integer.parseInt(args[0]);
       a = n % 10;
       n = n / 10;
       b = n % 10;
       c = n / 10;
       rev = 100 * a + 10 * b + c;
       System.out.println("rev = " + rev);
    }
}
