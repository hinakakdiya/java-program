//string mathod.
import java.util.*;
public class stringm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = a.concat(b);
        System.out.println("Concat :" + c);

        int x = a.hashCode();
        System.out.println("hashcode :" + x);

        boolean bb = a.equals(b);
        System.out.println("equals :" + bb);

        //be string na first letter ni ascii value no diffrence aave.
        int d = a.compareTo(b);
        System.out.println("compare :" + d);

        int e = a.codePointAt(7);
        System.out.println("codepoint :" + e);

        int f = a.codePointBefore(7);
        System.out.println("codepointbefore :" + f);

        int g = a.codePointCount(4,10);
        System.out.println("codepointcount :" + g);

        char ch = a.charAt(7);
        System.out.println("charAt :" + ch);

        boolean h = a.contains("my");
        System.out.println("contain :" + h);

        String z[] = a.split(" ");
        for( int i=0;i<=z.length;i++)
        {
           System.out.println("split : " + z[i]);
        }
}
    
}
