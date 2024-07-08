
//2 player gassing number game.AN=actual number.GN=gussing number. 
import java.util.*;

public class ngame {
    public static void main(String[] args) {

        Random Rm = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to the guessing number game");
        System.out.println("game information below:");
        System.out.println("guess number beetween 1 to 100");
        System.out.println("you can enter any random number.");
        System.out.println("you can guess number in 10 trying.");
        System.out.println("The one of 2 player who guesses the number in less effort wins.");

        System.out.println("enter 1st player name :->");
        String A = sc.nextLine();
        System.out.println("enter 2nd player name :->");
        String B = sc.nextLine();

        int AN = Rm.nextInt(1, 100);
        int Pt1 = 0;
        int Pt2 = 0;

        System.out.println(A + "'s turn :->");
        System.out.println("enter any number beetween 1 to 100 :");

        System.out.println("enter guessing number :");
        while (true) {
            Pt1++;
            int GN = sc.nextInt();

            if (AN == GN) {
                System.out.println("your try is successfully");
                break;
            } else if (AN > GN) {
                System.out.println("please enter bigger number:");
            } else if (AN < GN) {
                System.out.println("please enter smaller number:");
            }

        }
        System.out.println(B + "'s turn :->");
        System.out.println("enter any number beetween 1 to 100 :");
        System.out.println("enter guessing number :");
        while (true) {
            Pt2++;
            int GN = sc.nextInt();

            if (AN == GN) {
                System.out.println("your try is successfully");
                break;
            } else if (AN > GN) {
                System.out.println("please enter bigger number:");
            } else if (AN < GN) {
                System.out.println("please enter smaller number:");
            }

        }
        System.out.println("player 1 tryle :" + Pt1);
        System.out.println("Player 2 tryle :" + Pt2);

        if (Pt1 > Pt2) {
            System.out.println("player 2 is winner");
        } else if (Pt1 < Pt2) {
            System.out.println("player 1 is winner");
        } else {
            System.out.println("It's draw(same try)");
        }
    }
}
