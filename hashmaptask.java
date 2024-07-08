import java.util.*;

public class hashmaptask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Create a HashMap to store email keys and related information
        Map<String, String> emailMap = new HashMap<>();

        System.out.print("How many keys you needed into Hashmap:-->");
        int a = sc.nextInt();

        System.out.print("How many value you needed for Gmail:-->");
        int G = sc.nextInt();

        int[] mail = new int[10];

    // Add keys and values (Name, Age)
    emailMap.put("John", "ghjj");
    emailMap.put("Steve", "njk");
    emailMap.put("Angie", "jjmm");

    for (String i : emailMap.keySet()) {
      System.out.println("key: " + i + " value: " + emailMap.get(i));
    }


    }
}




    // // Method to generate a random three-digit number
    // public static int generateRandomJanrate() {
    //     Random random = new Random();
    //     return random.nextInt(900) + 100; // Generates a random number between 100 and 999 (inclusive)
    // }


    

