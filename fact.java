import java.util.*;
public class fact {
    public static int fact1(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n * fact1(n - 1);
        }
    }
    public static void main(String[] args) {
        
        System.out.println("f = "+ fact1(5));
    }
    
}
