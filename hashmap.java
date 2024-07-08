import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        
        HashMap<String,String> HM = new HashMap<>();
                //key,value.

        HM.put("programmer","magical");
        HM.put("student","Awesome");
        HM.put("kids","cute");
        HM.put("programmer","moye moye");
        System.out.println(HM);

        System.out.println();

        System.out.println(HM.get("programmer"));

        System.out.println();

        HM.keySet();
        System.out.println(HM);
        for (String i : HM.keySet())
         {
            System.out.println(i);
         }

         System.out.println();
        
        HM.values();
        for (String i : HM.values())
        {
           System.out.println(i);
        }

         System.out.println();

         for (String i : HM.keySet()) {
            System.out.println("key: " + i +" value: " + HM.get(i));
          }

          System.out.println();

          System.out.println(HM.size());

          HM.remove("student");
          System.out.println(HM);

          HM.clear();
          System.out.println(HM);

    }
    
}
