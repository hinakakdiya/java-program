import java.util.*;

public class surat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string :");
        String c = sc.nextLine();
        System.out.println("Enter the sentence :");
        String a = sc.nextLine();

        String[] A = {"sutar", "is", "smart", "city"};
        String[] b = a.split(" ");
        String output = " ";

        for (int i = 0; i < b.length; i++) 
        {
            output = output + b[i].substring(1) + b[i].charAt(0) + c + " ";
        }
        System.out.println("output=" + output);
    }

}
