import java.util.*;
class Testclass {
    int a,b;
    Scanner sc = new Scanner(System.in);
    public void setter()
    {
       System.out.print("enter a value :");
       a = sc.nextInt();
       System.out.print("enter b value :");
       b = sc.nextInt(); 
    }
    public void getter()
    {
        System.out.println("a= "+ a + " " + "b =" + b);
        System.out.println("a + b = " +(a+b));
        System.out.println("a - b = " +(a-b));
        System.out.println("a * b = " +(a*b));
        System.out.println("a / b = " +(a/b));
    } 
}
   public class classTest{
    public static void main(String[] args)
   {
        Testclass TC = new Testclass();
        TC.setter();
        TC.getter(); 
    }
}



                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                


   

