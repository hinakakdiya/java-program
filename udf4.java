
//with return type without argument.
import java.util.*;

public class udf4 {
    public static void main(String[] args) {
       int z = sum();
        System.out.println("x + y :" + z);
    }
        public static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the x value :");
        int x = sc.nextInt();
        System.out.print("enter the y value :");
        int y = sc.nextInt();
        int z = x + y;
        return z;
        
    }

}
