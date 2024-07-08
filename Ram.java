//use the keyword 
import java.util.*;
   class A {             //class - final keyword lagavvu - class fix thai jashe
     int year = 2024;    //variable - static lagavvu - fix value rakhva mate
     void set()          //method

    {
        System.out.println("Jay Shree Ram"); 
        System.out.println("The year of Est of Ram Mandir is " +  year);
    }
    
}
class B extends A 
{
    public void set()
    {
        System.out.println("Jai Shree Krishna");
    }
}
public class Ram
{
    public static void main (String[] args)
    {
        A Ram  = new A();
        B Gopal = new B();

        Ram.set();
        Gopal.set();
    }
}