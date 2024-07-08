//enter 5 subject marks : total marks and percentage.

import java.util.*;

public class exceptionsubject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double percentage;

        int sum = 0;

        System.out.print("how many subject marks:");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.print("enter student marks:" + (i + 1) + "= ");
            
            try {
                marks[i] = sc.nextInt();
    
                if (marks[i] < 0 || marks[i] > 100) 
                {
                    System.out.print("Marks should be between 0 and 100");
                }
                sum = sum + marks[i];
            } 
            catch (Exception e) 
            {
                System.out.println("Invalid input. Please enter a valid integer.");

            }
        }
        percentage = sum / n;
        System.out.println("Sum of subject marks: " + sum);
        System.out.println("percentage :" + percentage+ "%");
    }
}
