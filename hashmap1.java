import java.util.HashMap;

public class hashmap1 {

    public static void main(String[] args) {
        
        HashMap<String,Integer> hm = new HashMap<>();

        // Add keys and values (Name, Age)
        hm.put("John",33);
        hm.put("Steve",30);
        hm.put("Angie",32);
        System.out.println(hm);

        System.out.println("<------------>");

        HashMap<Integer,Integer> HM = new HashMap<>();

        HM.put(10,20);
        HM.put(30,40);
        HM.put(50,60);
        HM.put(10,70); //2 same key hoi to last key,value count thshe.
        HM.put(80,20); //but 2 same value hoi to all key,value count thshe.
        System.out.println(HM);

        System.out.println("<------------>");

        System.out.println(hm.get("Steve"));

        System.out.println("<------------->");

        hm.keySet();
        System.out.println(hm);
        for (String i : hm.keySet())
        {
            System.out.println(i);
        }

        System.out.println("<------------->");

        for (Integer i : HM.keySet()) {
            System.out.println("key: " + i +" value: " + HM.get(i));
          }
    }
    
}
