import java.util.*;
public class Wrapper {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       
        System.out.print("int =");
        int i = input.nextInt();
        System.out.print("float =");
        float f = input.nextFloat();
        System.out.print("double =");
        double d = input.nextDouble();
        System.out.print("char =");
        char c = input.next().charAt(0);
        System.out.print("short =");
        short s = input.nextShort();
        System.out.print("long =");
        long l = input.nextLong();
        System.out.print("boolean =");
        boolean b = input.nextBoolean();
        System.out.print("byte =");
        byte b1 = input.nextByte();
        System.out.print("string =");
        input.nextLine();
        String s1 = input.nextLine();
        
        //variable to Object
        Integer ii = i;
        Float ff = f;
        Double dd = d;
        Character cc = c;
        Short ss = s;
        Long ll = l;
        Boolean bb = b;
        Byte b1b1 = b1;
        String s1s1 = s1;

        System.out.println();

        System.out.println("ii =" + ii);
        System.out.println("ff =" + ff);
        System.out.println("dd =" + dd);
        System.out.println("cc =" + cc);
        System.out.println("ss =" + ss);
        System.out.println("ll =" + ll);
        System.out.println("bb =" + bb);
        System.out.println("b1b1 =" + b1b1);
        System.out.println("s1s1 =" + s1s1);

        //object to variabe
        int iii = ii;
        float fff= ff;
        double ddd = dd;
        char ccc = cc;
        short sss = ss;
        long lll = ll;
        boolean bbb = bb;
        byte b1b1b1 = b1b1;
        String s1s1s1 = s1s1;

        System.out.println();
        
        System.out.println("iii =" + iii);
        System.out.println("fff =" + fff);
        System.out.println("ddd =" + ddd);
        System.out.println("ccc =" + ccc);
        System.out.println("sss =" + sss);
        System.out.println("lll =" + lll);
        System.out.println("bbb =" + bbb);
        System.out.println("b1b1b1 =" + b1b1b1);
        System.out.println("s1s1s1 =" + s1s1s1);
        
    }
    
}
