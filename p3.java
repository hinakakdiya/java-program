import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        
        int i,j,n;
        System.out.print("Enter the value :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            if(j>=n+1-i)
            {
                System.out.print(" * ");
            }
            else
            {
                 System.out.print("   ");
            }
            System.out.print("\n");
        }    
}
}