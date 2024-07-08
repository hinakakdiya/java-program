import java.util.*;
class A {
    double f,I;
    int n;

    Scanner sc = new Scanner(System.in);

    public void setter() {

        System.out.println("Enter the Feet :");
        f = sc.nextFloat();

        System.out.println("Enter the Inch :");
        I = sc.nextFloat();
    }

    public A calculate(A obj) {
        A aa = new A();

        aa.f = f + obj.f;
        aa.I = I + obj.I;

        System.out.println("sum of Feet:"+aa.f);
        System.out.println("sum of Inch:"+aa.I);
        System.out.println();
        System.out.println("Type 1 to convert from Feet to Inch");
        System.out.println("Type 2 to convert from Inch to Feet");

        System.out.print("enter the Type 1 & 2 :");
        n = sc.nextInt();

        switch(n)
        {
            case 1: // feet to Inch.
               
                I = f*12;
                System.out.print("Length in Inch :" + I);
                break;

            case 2: // Inch to feet.
                
                f = I/12;
                System.out.print("Lenght in feet :" + f);
                break;

            default:
                System.out.print("Incorrect choice");
                break;
         }
         return aa;
         }
     }
public class feetinch {
    public static void main(String[] args){

        A bb = new A();
        A b1 = new A();
        A b2 = new A();

        bb.setter();
        b1.setter();
        b2=bb.calculate(b1);
    }
}
    

