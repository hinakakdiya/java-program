//check the data type.
import java.util.Scanner;

public class string {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int a = 100;
    System.out.println("type of a:" + ((Object)a).getClass().getSimpleName());
   // System.out.println("type of a:" + str.getClass().getSimpleName());
 }   
}
