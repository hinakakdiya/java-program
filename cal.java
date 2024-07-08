import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        int a,b,n;
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter the a value :");
         a = Sc.nextInt();
        System.out.print("Enter the b value :");
        b = Sc.nextInt();

        System.out.println("Addition 1");
        System.out.println("Subtrection 2");
        System.out.println("Multiplication 3");
        System.out.println("Devided 4");
        System.out.print("Select Option :");
        n = Sc.nextInt();

        switch(n)
        {
        case 1: 
             System.out.println("Addition :" + (a+b));
             break;
        case 2:
            System.out.println("Subtrection :" + (a-b));
            break;
        case 3:
            System.out.println("Multiplication :" + (a*b));
            break;
        case 4: 
            System.out.println("Devided :" + (a/b));
            break;
        default :
            System.out.println("invalid :");
            break;
        }   
        
    }
}
