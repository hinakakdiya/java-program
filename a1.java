import java.util.*;
public class a1 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a[] = new int [10];
            System.out.print("enter the size of Array:");
            int  n = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                System.out.println("a[" +i+ "]:");
                a[i] =sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                System.out.println("a[" +i+ "]:"+a[i]);
            } 
            sc.close();
        }
    }

