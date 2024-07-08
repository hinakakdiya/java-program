// random otp jenerate.
import java.util.*;
public class OTP {
    public static void main(String[] args) 
        {
            Random rm = new Random();
            int otp =  rm.nextInt(1000,9999);
            System.out.println("your OTP is :" + otp);       
        }
    }
    

