import java.util.*;
public class hashset {
    public static void main(String[] args) {
        
        HashSet<String>hs=new HashSet<>();

        hs.add("When Woman Married a docter then it will be healthy");
        hs.add("When Woman Married a lawyer it will be legal");
        hs.add("When woman Married a soliger it will be secure");

        System.out.println(hs);

        System.out.println(hs.contains("cars in here"));
        System.out.println(hs.contains("When Woman Married a lawyer it will be legal"));
    }
    
    
}
