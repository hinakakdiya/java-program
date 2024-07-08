import java.util.*;
import java.util.stream.IntStream;
public class stringmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        IntStream b = a.chars();
        b.forEach(System.out::println);

        String c = " ".join("  ","apple","is","Good","Healthy","Fruits");
        System.out.println("join string :" + c);

        a.codePoints().forEach(System.out::println);
       
        String e = a.replace("small","big");
        System.out.println("replace :" + e);

        boolean f = a.contentEquals("my");
        System.out.println("equals :" + f);

        boolean g = a.endsWith("fast");
        System.out.println("endswith :" + g);

        boolean h = a.startsWith("hello");
        System.out.println("startwith :" + h);

        String I = a.trim();
        System.out.println("trim :" + I);
        
        String j = a.substring(3,8 );
        System.out.println("substring :" + j);

        String k = a.valueOf(4);
        System.out.println("valueof :" + k);

        byte l[] = a.getBytes();
        for(int i=0; i<l.length; i++)
        {
            System.out.println("Bytecode = " + l[i]);
        }

        boolean m = a.isBlank();
        System.out.println("is blank =" + m);

        boolean n = a.isEmpty();
        System.out.println("Empty =" + n);

   }

}
