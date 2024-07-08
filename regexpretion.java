// import java.io.*;
// import java.util.regex.*;
 
// // Driver class
// class regexpretion {
//     // Main function
//     public static void main(String[] args)
//     {
//         // Checks if the string matches with the regex
//         // Should be single character a to z
//         System.out.println(Pattern.matches("[a-z]", "g"));
 
//         // Check if the element is range a to z or A to Z
//         System.out.println(
//             Pattern.matches("[a-zA-Z]", "Gfg"));
//     }
// }

import java.io.*;
import java.util.regex.*;
 
// Driver class
class regexpretion {
    // Main function
    public static void main(String[] args)
    {
        // Checks if the string matches with the regex
        // Should be single character a to z
        System.out.println(Pattern.matches("[a-z]", "g"));
 
         // Check if all the elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "Gfg"));
 
        // Check if all the elements are non-spaces
        System.out.println(Pattern.matches("\\S+", "gfg"));
    } 
}