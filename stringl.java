//string mathod.
import java.util.*;

public class stringl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
       
        int l = a.length();
        System.out.println("length : " + l);
       
        String U = a.toUpperCase();
        System.out.println("Uppercase :" + U);

        String L = a.toLowerCase();
        System.out.println("Lowercase :" + L);

        int i = a.indexOf("krishna");
        System.out.println("index no :" + i);
        //(krishna aave aevu sentence enter karvu).

    }
    
}
