//with return type with argument.

import java.util.*;

public class udf2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the x value :");
        int x = sc.nextInt();
        System.out.print("enter the y value :");
        int y = sc.nextInt();
        sum(x, y);
        System.out.println("x+y" + (x+y));
    }

        public static int sum(int x, int y) {
        int z = x + y;
        return z;
    }
}
