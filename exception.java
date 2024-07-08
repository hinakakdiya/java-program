import java.util.*;

public class exception {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        /*System.out.print("enter Integer number:");
        int A = sc.nextInt();
        System.out.println("<------>After taking value<------>");*/
        
        try{
            System.out.print("a=>");
            int a = sc.nextInt();
            System.out.println("<---->After value<---->");//enter int value so this part run. 
        }
        catch(Exception e){
            System.out.println("<---->In catch block<---->");//enter float value so this part run.
            System.out.println(e);
        }
        System.out.println("Hello After try-catch block");
    }

}
