import java.util.*;

class A {
    double f, c;
    int n;
    Scanner sc = new Scanner(System.in);

    public void setter() {

        System.out.println("Enter the fahrenheit :");
        f = sc.nextFloat();

        System.out.println("Enter the celsius :");
        c = sc.nextFloat();
    }

    public A calculate(A obj) {
        A aa = new A();

        aa.f = f + obj.f;
        aa.c = c + obj.c;

        System.out.println("sum of Fahrenheit:"+aa.f);
        System.out.println("sum of Celsius:"+aa.c);
        System.out.println();
        System.out.println("Type 1 to convert from Fahrenheit to Celsius");
        System.out.println("Type 2 to convert from Celsius to Fahrenheit");

        System.out.print("enter the Type 1 & 2 :");
        n = sc.nextInt();

        switch(n)
        {
            case 1: // fahrenheit to celsius.
               
                c = 5 / 9* (f - 32);
                System.out.print("Tempreture in Celsius :" + c);
                break;

            case 2: // celsius to fahrenheit.
                
                f = 1.8 * c + 32;
                System.out.print("Tempreture in Fehrenheit :" + f);
                break;

            default:
                System.out.print("Incorrect choice");
                break;
         }
         return aa;
         }
     }
public class tempreture {
    public static void main(String[] args){

        A bb = new A();
        A b1 = new A();
        A b2 = new A();

        bb.setter();
        b1.setter();
        b2=bb.calculate(b1);
    }
}