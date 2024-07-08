import java.util.*;
public class arraylist {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("Hello");
        a.add("How");
        a.add("are");
        a.add("you");
        a.add("?");
        System.out.println(a);

        for(String i :a)
        {
            System.out.println(i);
        }
        
        a.remove(2);
        System.out.println(a);
        
        a.set(3,"moye moye");
        System.out.println(a);

        System.out.println(a.get(0));
       
        System.out.println(a.size());

        Collections.sort(a);  //assending order.
        System.out.println(a);

        Collections.sort(a,Collections.reverseOrder());  //dessending order.
        System.out.println(a);
       
        a.clear();
        System.out.println(a);
    }
}
