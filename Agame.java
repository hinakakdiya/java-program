//random array game.
import java.util.*;
public class Agame {
    public static void main(String[] args) {
        Random Rm = new Random();
        Scanner sc = new Scanner(System.in);
        int RS = 100;
        int i,dis1,dis2,sum=0;

        System.out.println("_____WELCOME TO THE DISE NUMBER GUESSING GAME_____");
        System.out.println(" <-----: Instraction :----->");
        System.out.println("1.until your balance upto 60 RS.you can play the game.");
        System.out.println("2.Your two dise of sum and your guess number are 6, than you win 20 RS. otherwise you lose 20 RS.");
        System.out.println("3.Your two dise of sum and your guess number are upto 6 & down to and both are same than you win 10 RS. otherwise you lose 10 RS.");
        System.out.println("4.If your balance less then 60 RS.than you lose the game.");
        System.out.println();

        System.out.print("enter your name :--->");
        String name = sc.nextLine();

        int[] arr = new int[10];
        System.out.print("A = [");
        for (i = 0; i < 10; i++)
        {
            arr[i] = Rm.nextInt(1,12);
            System.out.print(arr[i]+" ");
        } 
        System.out.println("]");

        for(i=0;i<=arr.length;i++)
        {
            if(RS>=60)
            {
                System.out.println();
                dis1 = Rm.nextInt(1,6);
                dis2 = Rm.nextInt(1,6);
                System.out.println("dise number 1 :" + dis1);
                System.out.println("dise number 2 :" + dis2);
                sum = dis1 + dis2;
                System.out.println("sum of dise 1 and dise 2 :" +sum);

             if(arr[i]==6 && sum==6)
             {
                System.out.println("equal up to +20");
                RS = RS + 20;
                System.out.println("Total = " + RS);
             }
             else if(arr[i]>6 && sum>6 || arr[i]<6 && sum<6)
             {
                 System.out.println("up and down +10");
                 RS = RS + 10;
                 System.out.println("Total =" + RS);
             }
             else if(arr[i]>6 || sum<6 && arr[i]<6 || sum>6)
             {
                 System.out.println("up to down -10");
                 RS = RS - 10;
                 System.out.println("Total =" + RS);
             }
             else if(arr[i]!=6 || sum==6 && arr[i]==6 || sum!=6)
             {
                 System.out.println("not equal -20");
                 RS = RS - 20;
                 System.out.println("Total =" + RS);
             }
             else
             {
                 System.out.println("your game is over_____!");
                 System.out.println("...opps...! you loss the game...");
                 break;
             }
        }
        System.out.println("yapp...! your grand total is :-->" + RS);
        sc.close();
        }

    }
}
    
        
    



