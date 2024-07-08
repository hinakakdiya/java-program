//command line arrgument.
//sum of command.
//ex: java command 12 14 35 45 46 etc enter karvu.
import java.util.*;
public class command {
    public static void main(String[] args) {
     System.out.println("args [" + 2 + "] =" +  args[2]);
     
       int sum = 0;
       {
          for(int i=0; i<args.length; i++)
          { 
             sum += Integer.parseInt(args[i]);
          }
         System.out.println("sum =" +sum);        
      }
}
}
