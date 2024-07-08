//without return type with argument (perameter).
import java.util.*;
public class udf3 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the x value :");
        int x = sc.nextInt();
        System.out.print("enter the y value :");
        int y = sc.nextInt();
        sum(x, y);
    }
    public static void sum(int x, int y) {
        int z = x + y;
        System.out.println("z :" + z);

    }

}
