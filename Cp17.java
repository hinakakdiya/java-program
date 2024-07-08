//Total salary= BASIC + DA (40% of basic salary) + HRA (20% of basic) +RA (10% of basic).
import java.util.*;
public class Cp17 {
    public static void main(String[] args) {
        double total,basic,da,hra,ra,a;
        Scanner input =  new Scanner(System.in);
        
        System.out.print("enter the basic salary :");
        basic = input.nextDouble();

        a = basic;
        da = basic * 0.40;
        hra = basic * 0.20;
        ra = basic * 0.10;
        total = basic + da + hra + ra;
        System.out.println("total =" + total);
}
    
}
