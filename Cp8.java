//sum & average of 3 integer numbers.
import java.util.*;
public class Cp8 {

    public static void main(String[] args) {
        float a,b,c,sum,avg;
        Scanner input = new Scanner(System.in);
       
        System.out.print("enter the value of a:");
        a = input.nextFloat();
        System.out.print("enter the value of b:");
        b = input.nextFloat();
        System.out.print("enter the value of c:");
        c = input.nextFloat();
       
        sum = a+b+c;
        avg = sum/3;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

    }
    
}
