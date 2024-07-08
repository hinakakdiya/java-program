import java.util.*;

public class stringarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        string[] cars = new string[10];

        System.out.println("enter the value");

        String n = sc.nextLine();
        for (int i = 0; i < cars.length; i++) 
        {
            System.out.println(cars[i]);
        }
    }

}
