import java.util.*;

public class hashmaptask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a HashMap to store email provider data
        HashMap<String, HashMap<String, String>> emailData = new HashMap<>();

        // User enters 4 keys
        System.out.println("Enter 4 keys:");
        // System.out.print("enter the number of key:");
        // int a = scanner.nextInt();
        for (int i = 0; i < 4; i++) {
            String key = scanner.nextLine();
            emailData.put(key, new HashMap<>());
        }

        // Define email providers
        String[] providers = {"gmail", "yahoo", "hotmail", "hero"};

        // User input for each email provider
        for (String provider : providers) {
            System.out.println("<---:Enter data for " + provider + ":--->");
            HashMap<String, String> providerData = emailData.get(provider);
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter key for " + provider + ":");
                String key = scanner.nextLine();
                System.out.print("Enter value for " + provider + ": ");
                String value = scanner.nextLine();
                providerData.put(key, value);
            }
            emailData.put(provider, providerData);
        }

        // Generate and add random numbers to each email
        Random random = new Random();
        for (String provider : providers) {
            HashMap<String, String> providerData = emailData.get(provider);
            for (String key : providerData.keySet()) {
                String email = providerData.get(key) + "@" + provider + ".com";
                StringBuilder randomNumbers = new StringBuilder();
                for (int i = 0; i < 3; i++) {
                    randomNumbers.append(random.nextInt(10));
                }
                emailData.get(provider).put(key, email + " Random Numbers: " + randomNumbers.toString());
            }
        }

        // Display the HashMap
        System.out.println("\nEmail Data:");
        for (String provider : emailData.keySet()) {
            System.out.println(provider + " : " + emailData.get(provider));
        }

        scanner.close();
    }
}

    

